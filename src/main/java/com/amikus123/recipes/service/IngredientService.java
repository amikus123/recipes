package com.amikus123.recipes.service;

import com.amikus123.recipes.entity.Ingredient;

import java.util.List;

public interface IngredientService {
    Ingredient getIngredientById(Long id);
    List<Ingredient> getAllIngredients();
    Ingredient saveIngredient(Ingredient ingredient);
    void deleteIngredient(Long id);
    // Add other service methods as needed
}
