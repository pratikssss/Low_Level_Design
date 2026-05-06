package org.example;

public interface VendingMachineState {
    void insertMoney(int money);
    void pressButton(String product);
    void dispence();
}
