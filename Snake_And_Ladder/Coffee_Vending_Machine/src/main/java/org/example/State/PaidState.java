package org.example.State;

import org.example.CoffeeInventory;
import org.example.CoffeeVendingMachine;
import org.example.Entities.Coffee;
import org.example.Enums.CoffeeType;

public class PaidState implements VendingMachineState{
    CoffeeInventory inventory = CoffeeInventory.getInstance();
    @Override
    public void selectCoffee(CoffeeVendingMachine machine, Coffee coffee) {

    }

    @Override
    public void insertMoney(CoffeeVendingMachine machine, int money) {

    }

    @Override
    public void dispenceCoffee(CoffeeVendingMachine machine, Coffee coffee, CoffeeType coffeeType) {
        System.out.println("Coffee dispensed!!!!");
        inventory.subtractIngredient(coffeeType, coffee);
        System.out.println("Money left in machine "+machine.getMoneyInserted());
    }
}
