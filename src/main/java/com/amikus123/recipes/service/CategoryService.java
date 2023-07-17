package com.amikus123.recipes.service;

import com.amikus123.recipes.entity.Category;

import java.util.List;

public interface CategoryService {
    Category getCategoryById(Long id);
    List<Category> getAllCategories();
    Category saveCategory(Category category);
    void deleteCategory(Long id);
    // Add other service methods as needed
}