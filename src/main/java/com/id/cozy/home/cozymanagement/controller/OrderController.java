package com.id.cozy.home.cozymanagement.controller;

import com.id.cozy.home.cozymanagement.dto.order.OrderCreateRequest;
import com.id.cozy.home.cozymanagement.entity.OrderEntity;
import com.id.cozy.home.cozymanagement.service.order.AddOrderService;
import com.id.cozy.home.security.annotation.CheckAccess;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author martin
 * Date 06/03/26
 */

@RestController
@RequestMapping("api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final AddOrderService addOrderService;

    @PostMapping
    @CheckAccess
    public ResponseEntity<OrderEntity> addOrder(@RequestBody List<OrderCreateRequest> request) {
        return ResponseEntity.ok().body(addOrderService.addOrder(request));
    }
}
