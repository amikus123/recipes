package com.amikus123.recipes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.amikus123.recipes.entity.IngredientCategory;

public interface IngredientCategoryRepository extends JpaRepository<IngredientCategory, Long> {
    // Add custom repository methods if needed
}