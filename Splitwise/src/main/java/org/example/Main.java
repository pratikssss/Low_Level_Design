package org.example;

import org.example.Entities.BalanceSheet;
import org.example.Entities.User;
import org.example.Strategies.Strategy1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User justin = new User("Justin");
        BalanceSheet balanceSheetJustin = new BalanceSheet("Justin");
        User charlie = new User("Charlie");
        BalanceSheet balanceSheetCharlie = new BalanceSheet("Charlie");
        User bob = new User("Bob");
        BalanceSheet balanceSheetBob = new BalanceSheet("Bob");
        Splitwise splitwise = Splitwise.getInstance();
        splitwise.registerMembers(List.of(justin, charlie, bob));
        // implementing only equal splitting
        splitwise.split("Justin", List.of(justin.getUsername(), charlie.getUsername(), bob.getUsername()), new Strategy1(), 90);
        balanceSheetCharlie.getBalanceSheet();
    }
}