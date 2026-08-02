package org.example.ChainOfResponsibility;

import org.example.ATMsystem;
import org.example.BankService;
import org.example.Entities.Card;

public abstract class Dispenser {
    protected Dispenser nextDispenser;
    protected int handlerLevel;

    public void setNextDispenser(Dispenser dispenser) {
        this.nextDispenser = dispenser;
    }
    public void amountDeduced(int currentLevel, int money, Card card) {
        BankService bankService = BankService.getBankServiceInstance();
           if (money>0) {
               int numberOfNotes = money / currentLevel;
               System.out.println(numberOfNotes + " notes of " + currentLevel);
               String accountNumber = bankService.getCardAccountMap().get(card);
               int reminder = money % currentLevel;
               if (reminder != 0 && nextDispenser != null) {
                   nextDispenser.amountDeduced(nextDispenser.handlerLevel, money-numberOfNotes*currentLevel, card);
               }
           }
    }
}
