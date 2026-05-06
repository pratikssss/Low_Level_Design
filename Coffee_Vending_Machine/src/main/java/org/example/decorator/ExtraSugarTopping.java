package org.example.decorator;

import org.example.Entities.Coffee;

public class ExtraSugarTopping extends CoffeeTopping {
    private final Coffee coffee;
    public ExtraSugarTopping(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int getPrice() {
        return 5 + this.coffee.getPrice();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Topping : Extra Sugar";
    }
}
