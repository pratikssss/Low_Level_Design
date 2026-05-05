package org.example.State;

import org.example.CoffeeVendingMachine;
import org.example.Entities.Coffee;
import org.example.Enums.CoffeeType;

public class ReadyState implements VendingMachineState{
    @Override
    public void selectCoffee(CoffeeVendingMachine machine, Coffee coffee) {
        machine.setState(new SelectingState());
        System.out.println("Coffee "+coffee.getDescription()+" is selected!!!");
    }

    @Override
    public void insertMoney(CoffeeVendingMachine machine, int money) {

    }

    @Override
    public void dispenceCoffee(CoffeeVendingMachine machine, Coffee coffee, CoffeeType coffeeType) {

    }
}
