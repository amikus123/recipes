package com.amikus123.recipes.dto.ingredient;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateIngredientCategoryDto{
  @Schema(description = "Ingredient category", example = "Fruits")
  private  String name;
}
