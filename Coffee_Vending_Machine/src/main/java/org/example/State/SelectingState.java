package org.example.State;

import org.example.CoffeeVendingMachine;
import org.example.Entities.Coffee;
import org.example.Enums.CoffeeType;

public class SelectingState implements VendingMachineState{
    @Override
    public void selectCoffee(CoffeeVendingMachine machine, Coffee coffee) {

    }

    @Override
    public void insertMoney(CoffeeVendingMachine machine, int money) {
            System.out.println("money inserted "+money);
            if(money>=machine.getCoffee().getPrice()) {
                machine.setState(new PaidState());
                machine.setInsertedMoney(money-machine.getCoffee().getPrice());
            }
    }

    @Override
    public void dispenceCoffee(CoffeeVendingMachine machine, Coffee coffee, CoffeeType coffeeType) {

    }
}
