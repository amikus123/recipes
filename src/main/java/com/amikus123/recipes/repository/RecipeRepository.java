package com.amikus123.recipes.repository;
import com.amikus123.recipes.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    // Add custom repository methods if needed
}