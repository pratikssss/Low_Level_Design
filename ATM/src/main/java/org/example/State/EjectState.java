package org.example.State;

import org.example.ATMsystem;
import org.example.Entities.Card;
import org.example.Enums.Operations;

public class EjectState implements ATMState{
    ATMsystem atmSystem = ATMsystem.getInstance();
    @Override
    public void insertCard(Card card, String pin) {

    }

    @Override
    public void typePin() {

    }

    @Override
    public void performOperation(Operations operation, Card card, int money) {

    }

    @Override
    public void eject() {
        System.out.println("Card ejected!");
        atmSystem.setAtmState(new IdleState());
    }
}
