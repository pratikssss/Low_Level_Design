package org.example.State;

import org.example.Entities.Card;
import org.example.Enums.Operations;

public interface ATMState {
    public void insertCard(Card card, String pin);
    public void typePin();
    public void performOperation(Operations operation, Card card, int money);
    public void eject();

}
