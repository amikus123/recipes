package com.amikus123.recipes.impl;
import com.amikus123.recipes.dto.ingredient.CreateIngredientCategoryDto;
import com.amikus123.recipes.entity.IngredientCategory;
import com.amikus123.recipes.repository.IngredientCategoryRepository;
import com.amikus123.recipes.service.IngredientCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngredientCategoryServiceImpl implements  IngredientCategoryService{
    private final IngredientCategoryRepository ingredientCategoryRepository;
    @Autowired
    public IngredientCategoryServiceImpl(IngredientCategoryRepository ingredientCategoryRepository) {
        this.ingredientCategoryRepository = ingredientCategoryRepository;

    }
    @Override
    public IngredientCategory getIngredientCategoryById(Long id) {
        return ingredientCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<IngredientCategory> getAllIngredientCategories() {
        return ingredientCategoryRepository.findAll();
    }

    @Override
    public IngredientCategory saveIngredientCategory(CreateIngredientCategoryDto createIngredientCategory) {
        IngredientCategory ingredientCategory = new IngredientCategory();
        ingredientCategory.setName(createIngredientCategory.getName());
        return ingredientCategoryRepository.save(ingredientCategory);
    }

    @Override
    public void deleteIngredientCategory(Long id) {
        ingredientCategoryRepository.deleteById(id);
    }
    // Implement other service methods as needed
}
