package com.id.cozy.home.cozymanagement.entity;

import com.id.cozy.home.security.entity.UserEntity;
import com.id.cozy.home.security.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author martin
 * Date 05/03/26
 */

@Entity
@Table(name = "MCZ_STORE")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class StoreEntity extends BaseEntity {
    @Column(name = "NAME", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserEntity user;

    @Lob
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
}
