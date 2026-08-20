package com.example.study.repository;

import com.example.study.model.Ingredient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IngredientRepository {

    public List<Ingredient> findAll() {

        List<Ingredient> ingredients = List.of(
                new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP),
                new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP),

                new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN),
                new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN),

                new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES),
                new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES),

                new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE),
                new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE),

                new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE),
                new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE)
        );

        return ingredients;
    }

    public List<Ingredient> findById(String id) {

        return this.findAll()
                .stream()
                .filter(ingredient -> ingredient.getId() == id)
                .toList();
    }

    public List<Ingredient> findByType(Ingredient.Type type) {

        return this.findAll()
                .stream()
                .filter(ingredient -> ingredient.getType() == type)
                .toList();
    }
}
