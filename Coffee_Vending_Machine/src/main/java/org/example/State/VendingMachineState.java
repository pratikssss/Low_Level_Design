package org.example.State;

import org.example.CoffeeVendingMachine;
import org.example.Entities.Coffee;
import org.example.Enums.CoffeeType;

public interface VendingMachineState {
    public void selectCoffee(CoffeeVendingMachine machine, Coffee coffee);
    public void insertMoney(CoffeeVendingMachine machine, int money);
    public void dispenceCoffee(CoffeeVendingMachine machine, Coffee coffee, CoffeeType coffeeType);
}
