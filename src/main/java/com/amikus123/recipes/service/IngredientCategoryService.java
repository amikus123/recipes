package com.amikus123.recipes.service;

import com.amikus123.recipes.dto.ingredient.CreateIngredientCategoryDto;
import com.amikus123.recipes.entity.IngredientCategory;

import java.util.List;

public interface IngredientCategoryService {
    IngredientCategory getIngredientCategoryById(Long id);
    List<IngredientCategory> getAllIngredientCategories();
    IngredientCategory saveIngredientCategory(CreateIngredientCategoryDto createIngredientCategory);
    void deleteIngredientCategory(Long id);
    // Add other service methods as needed
}