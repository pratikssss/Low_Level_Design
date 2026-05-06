package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Subject appleStock = new AppleStock();
        Observer mobilePhone = new MobilePhone();
        Observer laptop = new Laptop();
        appleStock.addObserver(mobilePhone);
        appleStock.addObserver(laptop);
        appleStock.updateObservers(100);
        appleStock.removeObserver(mobilePhone);
        appleStock.updateObservers(100);
    }
}

//What it is: A subscription mechanism. You have a "Subject" (the publisher) and multiple "Observers" (the subscribers).
// When the Subject's state changes, it automatically notifies all attached Observers.
//When to use it in interviews: Anytime you hear the words "notify," "subscribe," "events," or "real-time updates." Examples: Stock price tickers, Weather apps, or an Amazon "Notify me when in stock" feature.

// to ensure thread safety we can use copyOnWriteArrayList instead of ArrayList