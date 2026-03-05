package com.id.cozy.home.cozymanagement.entity;

import com.id.cozy.home.security.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
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
@Table(name = "MCZ_CATEGORY")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CategoryEntity extends BaseEntity {
    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @Lob
    @Column(name = "DESCRIPTION", columnDefinition = "CLOB", nullable = false)
    private String description;

}
