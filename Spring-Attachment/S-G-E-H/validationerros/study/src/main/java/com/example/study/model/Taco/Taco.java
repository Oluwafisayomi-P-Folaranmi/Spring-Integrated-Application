package com.example.study.model.Taco;

import com.example.study.model.Ingredient.Ingredient;
import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Taco {

    private Long id;

    private String name;

    private List<Ingredient> ingredients;

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
}
