package org.example;

import org.example.Entities.*;
import org.example.Enums.CoffeeType;
import org.example.Enums.Ingredient;
import org.example.Enums.ToppingType;
import org.example.decorator.CaramelSyrupTopping;
import org.example.decorator.ExtraSugarTopping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeInventory {
    private static volatile CoffeeInventory instance;
    private Map<Ingredient, Integer> ingredients = new HashMap<>();
    public static CoffeeInventory getInstance() {
        // First check (no locking, fast)
        if (instance ==  null) {
            // Lock the class only if instance is null
            synchronized (CoffeeInventory.class) {
                // Second check (inside the lock, safe)
                if (instance == null) {
                    instance = new CoffeeInventory();
                }
            }
        }
        return instance;
    }
    public void addIngredient(Ingredient ingredient, int quantity) {
        if (ingredients.containsKey(ingredient)) {
            ingredients.put(ingredient, ingredients.get(ingredient)+quantity);
        }
        else {
            ingredients.put(ingredient, quantity);
        }
    }
    public Map<Ingredient, Integer> getIngredients() {
        return this.ingredients;
    }

    public void subtractIngredient(CoffeeType coffeeType, Coffee coffee) {
        if (coffeeType.equals(CoffeeType.EXPRESSO)) {
            subtractIngredients(Expresso.getIngredients());
        }
        else if (coffeeType.equals(CoffeeType.CAPPUCINO)) {
            subtractIngredients(Cappuccino.getIngredients());
        }
        else if(coffeeType.equals(CoffeeType.LATTE)) {
            subtractIngredients(Latte.getIngredients());
        }
    }

    private void subtractIngredients(Map<Ingredient, Integer> ingredientsOfCoffee) {
        for (Ingredient ingredient: ingredients.keySet()) {
            Integer quantity = ingredients.get(ingredient)-ingredientsOfCoffee.get(ingredient);
            ingredients.put(ingredient,quantity);
        }
    }
}
