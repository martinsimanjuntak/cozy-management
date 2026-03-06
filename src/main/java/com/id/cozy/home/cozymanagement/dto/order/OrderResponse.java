package com.id.cozy.home.cozymanagement.dto.order;

import java.math.BigDecimal;

/**
 * @author martin
 * Date 06/03/26
 */


public record OrderResponse (
    String productName,
    BigDecimal price,
    BigDecimal totalPrice,
    Integer quantity,
    String buyerName,
    String storeName
){};
