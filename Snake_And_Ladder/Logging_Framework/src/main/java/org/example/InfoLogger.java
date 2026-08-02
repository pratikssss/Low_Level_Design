package org.example;

import org.example.Enums.LoggerType;
import org.example.Observers.Observer;
import org.example.Observers.Subject;

import java.util.ArrayList;
import java.util.List;

public class InfoLogger extends LoggerHandler implements Subject {
    List<Observer> observers = new ArrayList<>();
    public InfoLogger() {
        this.handlerLevel = LoggerType.INFO.getLevel();
    }
    public void log() {
        System.out.println("Info logger");
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
