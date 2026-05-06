package org.example.State;

import org.example.ATMsystem;
import org.example.BankService;
import org.example.Entities.Card;
import org.example.Enums.Denominations;
import org.example.Enums.Operations;

public class AuthenticatedState implements ATMState{
    ATMsystem atmSystem = ATMsystem.getInstance();
    BankService bankService = BankService.getBankServiceInstance();
    @Override
    public void insertCard(Card card, String pin) {

    }

    @Override
    public void typePin() {

    }

    @Override
    public void performOperation(Operations operation, Card card, int money) {
        String accountNumber = bankService.getCardAccountMap().get(card);
        if (operation.equals(Operations.DEPOSIT)) {
            System.out.println("Money deposited!!");
            bankService.addBalanceToAccount(accountNumber,money);
            atmSystem.setAtmState(new EjectState());
            atmSystem.getAtmState().eject();
        }
        else if (operation.equals(Operations.WITHDRAW_CASH)) {
            bankService.getAccountBalanceMap().put(accountNumber, bankService.getAccountBalanceMap().get(accountNumber) - money);
            atmSystem.getDispenser().amountDeduced(Denominations.THOUSAND.getValue(), money, card);
        }
    }


    @Override
    public void eject() {

    }
}
