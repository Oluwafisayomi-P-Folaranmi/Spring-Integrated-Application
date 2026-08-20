package com.example.study.service;

import com.example.study.model.Ingredient.Ingredient;
import com.example.study.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    public final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> findByType(Ingredient.Type type) {
        return ingredientRepository.findByType(type);
    }
}
