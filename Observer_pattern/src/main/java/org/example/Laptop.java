package org.example;

public class Laptop implements Observer{
    @Override
    public void update(int stockPrice) {
        System.out.println("Apple stock price in laptop " + stockPrice);
    }
}
