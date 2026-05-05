package org.example;

import org.example.Entities.Account;
import org.example.Entities.Card;
import org.example.Enums.Operations;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ATMsystem atmsystem = ATMsystem.getInstance();
        BankService bankService = BankService.getBankServiceInstance();
        Card cardPratik = new Card("123456","1111");
        Account accountPratik = new Account("PratikAccount");
        bankService.attachCardToAccount(cardPratik, accountPratik.getAccountNumber());
        atmsystem.authenticate(cardPratik,"1111");
        atmsystem.deposit(Operations.DEPOSIT,cardPratik,7000);
        atmsystem.authenticate(cardPratik,"1111");
        atmsystem.checkBalance(Operations.CHECK_BALANCE, cardPratik);
        atmsystem.authenticate(cardPratik,"1111");
        atmsystem.withdraw(Operations.WITHDRAW_CASH, cardPratik, 5600);
        atmsystem.authenticate(cardPratik,"1111");
        atmsystem.checkBalance(Operations.CHECK_BALANCE,cardPratik);
    }
}

// state pattern for the different processes like withdraw money, deposit money and check balance
// chain of responsibility pattern to withdraw the money. 1000->500->100
// singleton pattern for bankService and ATMSystem