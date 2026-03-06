package com.id.cozy.home.cozymanagement.service.order;

import com.id.cozy.home.cozymanagement.dto.order.OrderCreateRequest;
import com.id.cozy.home.cozymanagement.entity.OrderEntity;
import com.id.cozy.home.cozymanagement.entity.OrderItemEntity;
import com.id.cozy.home.cozymanagement.entity.ProductEntity;
import com.id.cozy.home.cozymanagement.repository.OrderItemRepository;
import com.id.cozy.home.cozymanagement.repository.OrderRepository;
import com.id.cozy.home.cozymanagement.repository.ProductRepository;
import com.id.cozy.home.security.entity.UserEntity;
import com.id.cozy.home.security.service.GetUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author martin
 * Date 06/03/26
 */

@Service
@Slf4j
@RequiredArgsConstructor
public class AddOrderService {
    private final OrderItemRepository orderItemRepository;
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;
    private final GetUserService getUserService;

    public OrderEntity addOrder(List<OrderCreateRequest> request) {
        UserEntity user = getUserService.getUser();
        OrderEntity order = new OrderEntity();
        order.setOrderDate(LocalDateTime.now());
        order.setUser(user);
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (OrderCreateRequest orderCreateRequest : request) {
            ProductEntity product = productRepository.findById(orderCreateRequest.idProduct()).orElseThrow();
            BigDecimal price = product.getPrice().multiply(new BigDecimal(orderCreateRequest.quantity()));
            totalPrice = totalPrice.add(price);
            order.addItem(OrderItemEntity.builder()
                    .quantity(orderCreateRequest.quantity())
                    .product(product)
                    .price(price)
                    .build());
        }
        order.setTotalPrice(totalPrice);
        return orderRepository.save(order);
    }
}
