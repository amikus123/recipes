package com.amikus123.recipes.resources;

import com.amikus123.recipes.dto.ingredient.CreateIngredientCategoryDto;
import com.amikus123.recipes.entity.IngredientCategory;
import com.amikus123.recipes.service.IngredientCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingredient-categories")
public class IngredientCategoryController {
  private final IngredientCategoryService ingredientCategoryService;

  @Autowired
  public IngredientCategoryController(IngredientCategoryService ingredientCategoryService) {
    this.ingredientCategoryService = ingredientCategoryService;
  }

  @GetMapping("/{id}")
  @Operation(summary = "Get ingredient category by ID")
  @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Ingredient category found"),
      @ApiResponse(responseCode = "404", description = "Ingredient category not found")})
  public ResponseEntity<IngredientCategory> getIngredientCategoryById(@PathVariable Long id) {
    IngredientCategory ingredientCategory = ingredientCategoryService.getIngredientCategoryById(id);
    if (ingredientCategory == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(ingredientCategory);
  }

  @GetMapping
  @Operation(summary = "Get all ingredient categories")
  public ResponseEntity<List<IngredientCategory>> getAllIngredientCategories() {
    List<IngredientCategory> ingredientCategories = ingredientCategoryService.getAllIngredientCategories();
    return ResponseEntity.ok(ingredientCategories);
  }

  @PostMapping
  public ResponseEntity<IngredientCategory> createIngredientCategory(
    @RequestBody CreateIngredientCategoryDto createIngredientCategoryDTO) {
    IngredientCategory ingredientCategory = ingredientCategoryService.saveIngredientCategory(createIngredientCategoryDTO);
    return ResponseEntity.status(HttpStatus.CREATED).body(ingredientCategory);
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Delete ingredient category by ID")
  @ApiResponse(responseCode = "204", description = "Ingredient category deleted")
  public ResponseEntity<Void> deleteIngredientCategory(@PathVariable Long id) {
    ingredientCategoryService.deleteIngredientCategory(id);
    return ResponseEntity.noContent().build();
  }
}