package org.example;

public class SilentState implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Silent: (Screen lights up, but no sound)");
    }
}
