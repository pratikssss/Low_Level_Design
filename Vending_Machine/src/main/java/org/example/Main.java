package org.example;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = VendingMachine.getInstance();
        machine.insertMoney(Coins.FIFTY.getValue());
        machine.insertMoney(Coins.FIFTY.getValue());
        machine.pressButton("coke");
        machine.pressButton("coke");
        machine.insertMoney(Coins.FIFTY.getValue());
        System.out.println(machine.money);
        machine.pressButton("coke");
        machine.pressButton("water");
        machine.pressButton("water");
        machine.pressButton("chips");
        machine.pressButton("chips");
    }
}
//patterns used
// 1. Factory to create coke, water, chips
// 2. State to handle vending machine state
// 3. Singleton to create the vending machine

