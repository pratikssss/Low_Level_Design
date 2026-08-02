package org.example;

import org.example.Entities.Coffee;
import org.example.Enums.CoffeeType;
import org.example.Enums.ToppingType;
import org.example.State.ReadyState;
import org.example.State.VendingMachineState;
import org.example.decorator.CaramelSyrupTopping;
import org.example.decorator.ExtraSugarTopping;

import java.util.List;

public class CoffeeVendingMachine {
    private static volatile CoffeeVendingMachine instance;
    private VendingMachineState state;
    private int moneyInserted;
    private Coffee coffee;
    CoffeeType coffeeType;
    private CoffeeVendingMachine() {
        this.state = new ReadyState();
        this.moneyInserted = 0;
    }
    public static CoffeeVendingMachine getInstance() {
        // First check (no locking, fast)
        if (instance == null) {
            // Lock the class only if instance is null
            synchronized (CoffeeInventory.class) {
                // Second check (inside the lock, safe)
                if (instance == null) {
                    instance = new CoffeeVendingMachine();
                }
            }
        }
        return instance;
    }

    public void selectCoffee(CoffeeType coffeeType, List<ToppingType> toppings) {
        Coffee coffee = CoffeeFactory.getCoffee(coffeeType);
        for (ToppingType topping : toppings) {
            if (topping == ToppingType.CARAMEL_SYRUP) {
                coffee = new CaramelSyrupTopping(coffee);
            } else if (topping == ToppingType.EXTRA_SUGAR) {
                coffee = new ExtraSugarTopping(coffee);
            }
        }
        this.coffee = coffee;
        this.coffeeType = coffeeType;
        this.state.selectCoffee(this, coffee);
    }
    public void insertMoney(int amount) {
        this.state.insertMoney(this,amount);
    }
    public void dispenceCoffee() {
        this.state.dispenceCoffee(this, coffee, coffeeType);
    }
    public void setState(VendingMachineState state) {
        this.state = state;
    }
    public Coffee getCoffee() {
        return this.coffee;
    }
    public int getMoneyInserted() {
        return this.moneyInserted;
    }

    public void setInsertedMoney(int money) {
        this.moneyInserted = money;
    }
}
