package com.amikus123.recipes.dto.user;

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
public final class CreateUserDto {
  @Schema(description = "Ingredient category", example = "Fruits")
  private  String username;
  @Schema(description = "Ingredient category", example = "Fruits")
  private  String password;
  @Schema(description = "Ingredient category", example = "Fruits")
  private  String confirmPassword;


}
