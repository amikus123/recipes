package com.amikus123.recipes.repository;

import com.amikus123.recipes.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Add custom repository methods if needed
}