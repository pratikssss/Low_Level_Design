package org.example.Observers;

public class ConsoleObserver implements Observer {
    @Override
    public void update() {
        System.out.println("Console observer is notified");
    }
}
