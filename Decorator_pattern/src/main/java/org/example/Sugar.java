package org.example;

public class Sugar extends CoffeeDecorator{
    protected Sugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    public int getCost() {
        return super.getCost() + 10;
    }
    public String getDescription() {
        return super.getDescription() + " with sugar";
    }
}
