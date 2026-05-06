package org.example;

public class HasMoneyState implements VendingMachineState{
    private final VendingMachine vendingMachine;
    public HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int money) {
        System.out.println("Transferring to dispence state with " + money);
    }

    @Override
    public void pressButton(String product) {
        System.out.println("HasMoney state, no need to press button ");
        vendingMachine.dispence(product);
    }

    @Override
    public void dispence() {
        vendingMachine.setState(new DispenceState(vendingMachine));
//        System.out.println("Nothing to dispence yet!");
    }
}
