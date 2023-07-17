package com.amikus123.recipes.repository;

import com.amikus123.recipes.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    // Add custom repository methods if needed
}