package org.example.State;

import org.example.ATMsystem;
import org.example.Entities.Card;
import org.example.Enums.Operations;

public class IdleState implements ATMState{

    @Override
    public void insertCard(Card card, String pin) {
        ATMsystem atmSystem = ATMsystem.getInstance();
        System.out.println("Card inserted!!!!");
        atmSystem.setAtmState(new HasValidPinState(card, pin));
        atmSystem.getAtmState().typePin();
    }

    @Override
    public void typePin() {

    }

    @Override
    public void performOperation(Operations operation, Card card, int money) {
    }


    @Override
    public void eject() {

    }
}
