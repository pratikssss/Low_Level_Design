package org.example;

public class IdleState implements VendingMachineState{
    private final VendingMachine vendingMachine;
    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int money) {
        System.out.println("Transferring " +money+"Rs to hasMoney state");
        vendingMachine.setState(new HasMoneyState(vendingMachine));
    }

    @Override
    public void pressButton(String product) {
        System.out.println("Inserted money for " + product);
    }

    @Override
    public void dispence() {
        System.out.println("Nothing to dispence!!1");
    }
}
