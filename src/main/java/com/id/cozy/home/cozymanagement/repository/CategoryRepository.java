package com.id.cozy.home.cozymanagement.repository;

import com.id.cozy.home.cozymanagement.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author martin
 * Date 06/03/26
 */


public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
