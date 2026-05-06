package org.example.decorator;

import org.example.Entities.Coffee;

public class CaramelSyrupTopping extends CoffeeTopping {
    private final Coffee coffee;
    public CaramelSyrupTopping(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public int getPrice() {
        return 10 + coffee.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Topping : Caramel Syrup";
    }
}
