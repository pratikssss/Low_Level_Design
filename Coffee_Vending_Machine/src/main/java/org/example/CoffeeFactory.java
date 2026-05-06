package org.example;

import org.example.Entities.Cappuccino;
import org.example.Entities.Coffee;
import org.example.Entities.Expresso;
import org.example.Entities.Latte;
import org.example.Enums.CoffeeType;

public class CoffeeFactory {
    private CoffeeType coffeeType;

    public static Coffee getCoffee(CoffeeType coffeeType) {
        if(coffeeType == CoffeeType.EXPRESSO) {
            return new Expresso();
        }
        else if(coffeeType == CoffeeType.CAPPUCINO) {
            return new Cappuccino();
        }
        else if(coffeeType == CoffeeType.LATTE) {
            return new Latte();
        }
        return null;
    }
}
