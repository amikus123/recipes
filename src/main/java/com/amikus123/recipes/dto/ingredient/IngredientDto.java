package com.amikus123.recipes.dto.ingredient;

import com.amikus123.recipes.enumeration.IngredientAmountUnit;
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
public final class IngredientDto {
  @Schema(description = "Ingredient category", example = "Fruits")
  private  String name;
  @Schema(description = "Ingredient category", example = "Fruits")
  private  String value;
  @Schema(description = "Ingredient category", example = "Fruits")
  private  IngredientAmountUnit amountUnit;
  @Schema(description = "Ingredient category", example = "Fruits")
  private  String categoryName;



}
