package org.example.Entities;

import org.example.Splitwise;

import java.util.Map;

public class BalanceSheet {
    private String ownerName;
    private int totalBalance;
    private static Splitwise instance;
    public BalanceSheet(String ownerName) {
        this.ownerName = ownerName;
        this.totalBalance = 0;
    }
    public void getBalanceSheet() {
        // this tells how much this person owes to other people etc
        Splitwise instance = Splitwise.getInstance();
        Map<String, Map<String, Integer>> balances = instance.getbalances();
        Map<String, Integer> MapOwner = balances.get(ownerName);
        System.out.println("Balance sheet of "+ownerName);
        for(Map.Entry<String, Integer> mapOwner : MapOwner.entrySet()) {
            int getVal = mapOwner.getValue();
            if(getVal<0) {
                System.out.println(ownerName + " owes "+mapOwner.getKey()+" "+ (-(getVal)));
            }
            else {
                System.out.println(ownerName + " lends "+mapOwner.getKey()+" "+ ((getVal)));
            }
        }
    }
    public void setTotalBalance(int balance) {
        totalBalance += balance;
    }
    public int getBalance() {
        return this.totalBalance;
    }
}
