package com.example.study.repository;

import com.example.study.model.Ingredient;
import com.example.study.model.Taco;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TacoRepository {

    public List<Taco> findAll() {

        // Create a list of Tacos
        List<Taco> tacos = new ArrayList<>();
        // 1. Create some Tacos
        // 2. Put ingredients into tacos

        // Create the first taco
        Taco tacos1 = new Taco("taco1", new ArrayList<>());
        Ingredient ingredient1Taco1 = new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP);
        Ingredient ingredient2Taco1 =new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP);
        // Put ingredients into the tacos
        tacos1.addIngredient(ingredient1Taco1);
        tacos1.addIngredient(ingredient2Taco1);

        // Create the second taco
        Taco tacos2 = new Taco("taco2", new ArrayList<>());
        Ingredient ingredient1Taco2 = new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN);
        Ingredient ingredient2Taco2 = new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN);
        Ingredient ingredient3Taco2 = new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES);
        // Put ingredients into the tacos
        tacos2.addIngredient(ingredient1Taco2);
        tacos2.addIngredient(ingredient2Taco2);
        tacos2.addIngredient(ingredient3Taco2);

        // Create the third taco
        Taco tacos3 = new Taco("taco3", new ArrayList<>());
        Ingredient ingredient1Taco3 = new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES);
        // Put ingredients into the tacos
        tacos3.addIngredient(ingredient1Taco3);

        // Add the tacos to the list
        tacos.add(tacos1);
        tacos.add(tacos2);
        tacos.add(tacos3);
        // Return the list
        return tacos;
    }
}
