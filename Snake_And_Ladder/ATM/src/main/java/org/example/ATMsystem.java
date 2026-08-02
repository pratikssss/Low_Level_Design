package org.example;

import org.example.ChainOfResponsibility.DispenseFiveHundred;
import org.example.ChainOfResponsibility.DispenseHundred;
import org.example.ChainOfResponsibility.DispenseThousand;
import org.example.ChainOfResponsibility.Dispenser;
import org.example.Entities.Card;
import org.example.Enums.Operations;
import org.example.State.ATMState;
import org.example.State.IdleState;

public class ATMsystem {
    public static volatile ATMsystem Atmsystem;
    BankService bankService = BankService.getBankServiceInstance();
    private ATMState atmState;
    private final Dispenser dispenser;
    private final DispenseThousand dispenseThousand = new DispenseThousand();
    private final DispenseFiveHundred dispenseFiveHundred = new DispenseFiveHundred();
    private final DispenseHundred dispenseHundred = new DispenseHundred();
    private ATMsystem() {
        setAtmState(new IdleState());
        this.dispenser = dispenseThousand;
        dispenseThousand.setNextDispenser(dispenseFiveHundred);
        dispenseFiveHundred.setNextDispenser(dispenseHundred);
    }
    public static ATMsystem getInstance() {
        if (Atmsystem==null) {
           Atmsystem = new ATMsystem();
        }
        return Atmsystem;
    }

    public void deposit(Operations operation, Card card, int money) {
        atmState.performOperation(operation, card, money);
    }

    public void checkBalance(Operations operation, Card card) {
       String accountNumber = bankService.getCardAccountMap().get(card);
       System.out.println(accountNumber+" has balance "+bankService.getAccountBalanceMap().get(accountNumber));
    }

    public void setAtmState(ATMState state) {
        this.atmState = state;
    }
    public ATMState getAtmState() {
        return this.atmState;
    }

    public void authenticate(Card card, String pin) {
        atmState.insertCard(card, pin);
    }

    public void withdraw(Operations operation, Card card, int money) {
        atmState.performOperation(operation, card, money);
    }
    public Dispenser getDispenser() {
        return dispenser;
    }
}
