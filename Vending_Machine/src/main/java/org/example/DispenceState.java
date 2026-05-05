package org.example;

public class DispenceState implements VendingMachineState{
    private final VendingMachine vendingMachine;

    public DispenceState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int money) {
        System.out.println("Already in dispence state, no need to insert money!");
    }

    @Override
    public void pressButton(String product) {
    }

    @Override
    public void dispence() {
        System.out.println("Product dispensed!!");
    }
}
