package org.example.State;

import org.example.ATMsystem;
import org.example.Entities.Card;
import org.example.Enums.Operations;

public class HasValidPinState implements ATMState{
    private Operations operation;
    private Card card;
    private String pin;

    public HasValidPinState(Card card, String pin) {
        this.operation = operation;
        this.card = card;
        this.pin = pin;
    }

    @Override
    public void insertCard(Card card, String pin) {

    }

    @Override
    public void typePin() {
        ATMsystem atmSystem = ATMsystem.getInstance();
        if (pin.equalsIgnoreCase(card.getPin())) {

           System.out.println("Correct PIN");
            atmSystem.setAtmState(new AuthenticatedState());
        }
        else {
            System.out.println("Incorrect PIN");
            atmSystem.setAtmState(new EjectState());
        }
    }

    @Override
    public void performOperation(Operations operation, Card card, int money) {

    }


    @Override
    public void eject() {

    }
}
