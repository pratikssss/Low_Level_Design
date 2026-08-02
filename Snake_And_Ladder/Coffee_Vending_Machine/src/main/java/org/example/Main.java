package org.example;

import org.example.Entities.Coffee;
import org.example.Enums.CoffeeType;
import org.example.Enums.Ingredient;
import org.example.Enums.ToppingType;

import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoffeeInventory inventory = CoffeeInventory.getInstance();
        CoffeeVendingMachine machine = CoffeeVendingMachine.getInstance();
        inventory.addIngredient(Ingredient.SUGAR, 30);
        inventory.addIngredient(Ingredient.COFFEE_BEANS, 50);
        inventory.addIngredient(Ingredient.MILK, 100);
        CoffeeType coffeeType = CoffeeType.CAPPUCINO;
        machine.selectCoffee(coffeeType, List.of(ToppingType.EXTRA_SUGAR, ToppingType.CARAMEL_SYRUP));
        machine.insertMoney(100);
        machine.dispenceCoffee();
//        int money = 100;
//        if(coffee.getPrice() <= money) {
//            System.out.println("Money returned "+(money-coffee.getPrice())+" and desc "+coffee.getDescription());
//            inventory.subtractIngredient(coffeeType, coffee);
//        }
        // print inventory ingredients
        Map<Ingredient, Integer> ingredients = inventory.getIngredients();
        for (Ingredient ingredient: ingredients.keySet()) {
            Integer quantity = ingredients.get(ingredient);
            System.out.println(ingredient + " -> " + quantity);
        }
    }
}

// Decorator pattern is used to decorate the coffee with different decorators such as CaramelSyrupTopping,
// CoffeeTopping etc.
// State pattern is used to do the whole procedure i.e to selectCoffee, insertMoney into machine and then dispence it.
// Created a coffeeInventory to store what items are left in the inventory such as Milk etc
// CoffVendingMachine is created to perform state pattern operation as well as to handle the money thing.