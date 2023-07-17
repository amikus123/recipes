package com.amikus123.recipes.service;

import com.amikus123.recipes.entity.Recipe;

import java.util.List;

public interface RecipeService {
    Recipe getRecipeById(Long id);
    List<Recipe> getAllRecipes();
    Recipe saveRecipe(Recipe recipe);
    void deleteRecipe(Long id);
    // Add other service methods as needed
}