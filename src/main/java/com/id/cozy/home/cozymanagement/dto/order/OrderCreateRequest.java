package com.id.cozy.home.cozymanagement.dto.order;

import java.math.BigDecimal;

/**
 * @author martin
 * Date 06/03/26
 */


public record OrderCreateRequest(
        Integer quantity,
        Long idProduct){};
