package org.example;

public class MobilePhone implements Observer{
    @Override
    public void update(int stockPrice) {
        System.out.println("Apple stock price in mobile phone " + stockPrice);
    }
}
