package org.example;

public class CreditCardPayment implements PaymentStrategy{
    String creditCardNumber;
    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    public void pay(int amount) {
        System.out.println("Credit card amount paid with " +creditCardNumber + " is " + amount);
    }
}
