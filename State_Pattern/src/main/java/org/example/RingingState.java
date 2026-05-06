package org.example;

public class RingingState implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Playing ringtone: Riiiiiing!");
    }
}
