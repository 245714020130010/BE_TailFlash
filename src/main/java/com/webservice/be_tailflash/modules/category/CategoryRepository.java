package com.webservice.be_tailflash.modules.category;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

import com.webservice.be_tailflash.modules.category.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByNameKey(String nameKey);

    boolean existsByNameKey(String nameKey);

    List<Category> findByIsActiveTrueOrderBySortOrderAscNameKeyAsc(Pageable pageable);

    List<Category> findByIsActiveTrueAndNameKeyContainingIgnoreCaseOrderBySortOrderAscNameKeyAsc(
        String keyword,
        Pageable pageable
    );
}
