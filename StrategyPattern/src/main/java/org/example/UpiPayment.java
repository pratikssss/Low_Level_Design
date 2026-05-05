package org.example;

public class UpiPayment implements PaymentStrategy{
    String upiId;
    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment made by UPI "+ upiId + " and " + amount);
    }
}
