package com.amikus123.recipes.entity;

import com.amikus123.recipes.enumeration.IngredientAmountUnit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "ingredients")
@Data
@NoArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String value;

    @Enumerated(EnumType.STRING)
    private IngredientAmountUnit amountUnit;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private IngredientCategory category;
}