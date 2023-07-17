package com.amikus123.recipes.dto.ingredient;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public final class IngredientCategoryDto {
  @Schema(description = "Ingredient category", example = "Fruits")
  private String name;
}
