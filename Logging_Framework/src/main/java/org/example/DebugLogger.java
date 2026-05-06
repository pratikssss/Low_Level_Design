package org.example;

import org.example.Enums.LoggerType;
import org.example.Observers.Observer;
import org.example.Observers.Subject;

import java.util.ArrayList;
import java.util.List;

public class DebugLogger extends LoggerHandler implements Subject {
    List<Observer> observers = new ArrayList<>();
    public DebugLogger() {
        this.handlerLevel = LoggerType.DEBUG.getLevel();
    }
    public void log() {
        System.out.println("Debug logger");
    }

    @Override
    public void addObservers(Observer o) {
        observers.add(o);
    }
    @Override
    public void notifyObservers() {
        for(Observer o:observers) {
            o.update();
        }
    }
}
