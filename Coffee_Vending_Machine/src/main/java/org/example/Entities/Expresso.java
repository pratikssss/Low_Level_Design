package org.example.Entities;

import org.example.Enums.Ingredient;

import java.util.HashMap;
import java.util.Map;

public class Expresso extends Coffee{
    private int price = 10;
    private String description = "expresso";
    private static Map<Ingredient, Integer> ingredients = new HashMap<>();
    public Expresso() {
        ingredients.put(Ingredient.COFFEE_BEANS, 5);
        ingredients.put(Ingredient.MILK, 5);
        ingredients.put(Ingredient.SUGAR, 5);
    }
    public int getPrice() {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }
    public static Map<Ingredient,Integer> getIngredients() {
        return ingredients;
    }
}
