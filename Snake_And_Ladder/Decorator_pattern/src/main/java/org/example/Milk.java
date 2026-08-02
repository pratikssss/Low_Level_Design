package org.example;

public class Milk extends CoffeeDecorator{
    protected Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public int getCost() {
        return super.getCost() + 15;
    }
    public String getDescription() {
        return super.getDescription() + " with milk,";
    }
}
