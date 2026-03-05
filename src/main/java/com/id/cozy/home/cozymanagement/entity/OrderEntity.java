package com.id.cozy.home.cozymanagement.entity;

import com.id.cozy.home.security.entity.UserEntity;
import com.id.cozy.home.security.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author martin
 * Date 05/03/26
 */

@Entity
@Table(name = "MCZ_ORDER")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OrderEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserEntity user;

    @Column(name = "TOTAL_PRICE", nullable = false, precision = 19, scale = 2)
    private BigDecimal totalPrice;

    @Column(name = "ORDER_DATE", nullable = false)
    private LocalDateTime orderDate;
}
