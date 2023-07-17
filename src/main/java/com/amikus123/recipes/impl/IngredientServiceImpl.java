package com.amikus123.recipes.impl;
import com.amikus123.recipes.entity.Category;
import com.amikus123.recipes.entity.Ingredient;
import com.amikus123.recipes.repository.CategoryRepository;
import com.amikus123.recipes.repository.IngredientRepository;
import com.amikus123.recipes.service.CategoryService;
import com.amikus123.recipes.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient getIngredientById(Long id) {
        return ingredientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @Override
    public Ingredient saveIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public void deleteIngredient(Long id) {
        ingredientRepository.deleteById(id);
    }
    // Implement other service methods as needed
}