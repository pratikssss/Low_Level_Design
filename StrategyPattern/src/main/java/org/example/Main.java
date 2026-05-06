package org.example;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        PaymentStrategy upiPayment = new UpiPayment("pratik1");
        PaymentStrategy creditCardPayment = new CreditCardPayment("191019");
        payment.setPaymentStrategy(upiPayment);
        payment.pay(300);
    }
}



//Strategy pattern is used when there are a lot of if and else or switch block