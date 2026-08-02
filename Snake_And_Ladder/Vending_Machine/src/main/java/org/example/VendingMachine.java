package org.example;

public class VendingMachine {
    public static volatile VendingMachine instance;
    VendingMachine vendingMachine;
    VendingMachineState vendingMachineState;
    int money;
    String productSelected;
    Items coke;
    Items water;
    Items chips;
    private VendingMachine() {
        coke = new Coke("Coke", 30, 3);
        water = new Water("Water",20,2);
        chips = new Chips("Chips", 5,5);
        this.vendingMachine = instance;
        this.vendingMachineState = new IdleState(this);
    }
    public static VendingMachine getInstance() {
        if (instance == null) {
            synchronized (VendingMachine.class) {
                if (instance == null) {
                    instance = new VendingMachine();
                }
            }
        }
        return instance;
    }
    public void insertMoney(int money) {
        this.money += money;
        this.vendingMachineState.insertMoney(money);
    }
    public void pressButton(String product) {
        this.productSelected = product;
        this.vendingMachineState.pressButton(product);
    }
    public void dispence(String product) {
        this.productSelected = product;
        if ("coke".equalsIgnoreCase(instance.productSelected)) {
            Items coke = instance.coke;
            if (coke.getQuantity()>0 && instance.money >= 30) {
                coke.decreaseQuantity();
                int moneyToReturn = instance.money - 30;
                instance.money -= 30;
                System.out.println("Coke dispensed with change of "+ moneyToReturn);
            }
            else {
                System.out.println("sorry no cokes");
            }
        }
        else if ("water".equalsIgnoreCase(instance.productSelected)) {
            Items water = instance.water;
            if (water.getQuantity() > 0 && instance.money >= 20) {
                water.decreaseQuantity();
                int moneyToReturn = instance.money - 20;
                instance.money -= 20;
                System.out.println("Water dispensed with change of "+ moneyToReturn);
            }
            else {
                System.out.println("sorry no Water");
            }
        }
        else if ("chips".equalsIgnoreCase(instance.productSelected)) {
            Items chips = instance.chips;
            if (chips.getQuantity() > 0 && instance.money >= 5) {
                chips.decreaseQuantity();
                int moneyToReturn = instance.money - 5;
                instance.money -= 5;
                System.out.println("Chips dispenced with change of "+ moneyToReturn);
            }
            else {
                System.out.println("Sorry no chips");
            }
        }
        this.vendingMachineState.dispence();
        this.vendingMachineState = new HasMoneyState(this);
    }
    public void setState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }
}
