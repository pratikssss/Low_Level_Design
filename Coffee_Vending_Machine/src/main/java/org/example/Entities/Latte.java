package org.example.Entities;

import org.example.Enums.Ingredient;

import java.util.HashMap;
import java.util.Map;

public class Latte  extends Coffee{
    private final int price = 30;
    private final String description = "Latte";
    private static Map<Ingredient, Integer> ingredients = new HashMap<>();
    public Latte() {
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
