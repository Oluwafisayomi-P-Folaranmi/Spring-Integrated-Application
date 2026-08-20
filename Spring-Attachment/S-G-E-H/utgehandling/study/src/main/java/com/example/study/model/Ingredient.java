package com.example.study.model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@Builder
public class Ingredient {

    // ------------------- Type -------------------
    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    private final String id;

    private final String name;

    private final Type type;
}
