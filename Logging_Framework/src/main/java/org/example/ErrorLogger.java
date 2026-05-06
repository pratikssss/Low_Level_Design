package org.example;

import org.example.Enums.LoggerType;
import org.example.Observers.Observer;
import org.example.Observers.Subject;

import java.util.ArrayList;
import java.util.List;

public class ErrorLogger extends LoggerHandler implements Subject {
    List<Observer> observers = new ArrayList<>();
    public ErrorLogger() {
        this.handlerLevel = LoggerType.ERROR.getLevel();
    }
    public void log() {
        System.out.println("Error logger");
    }
    @Override
    public void addObservers(Observer o) {
        observers.add(o);
    }
    @Override
    public void notifyObservers() {
        for(var i=0;i<observers.size();i++) {
            observers.get(i).update();
        }
    }
}
