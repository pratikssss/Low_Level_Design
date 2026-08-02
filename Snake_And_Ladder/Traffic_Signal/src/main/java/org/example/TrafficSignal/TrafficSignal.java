package org.example.TrafficSignal;

import org.example.Enums.SignalColor;
import org.example.Observer;
import org.example.Subject;

import java.util.ArrayList;
import java.util.List;

public class TrafficSignal implements Subject {
    private SignalColor signalColor;
    private String signalId;
    List<Observer> observers = new ArrayList<>();

    public TrafficSignal(String signalId) {
        this.signalId = signalId;
        this.signalColor = SignalColor.GREEN;
    }
    public String signalId() {
        return this.signalId;
    }

    public void setStateToRed() {
        this.signalColor = SignalColor.RED;
        currentColor(this.signalColor);
    }

    public void setStateToYellow() {
        this.signalColor = SignalColor.YELLOW;
        currentColor(this.signalColor);
        setStateToRed();
    }

    public void currentColor(SignalColor currentSignalColor) {
        System.out.println("Current signal in " + this.signalId + " is " + currentSignalColor);
        if (currentSignalColor == SignalColor.GREEN) {
            notifyObservers();
            setStateToYellow();
        }
    }

    public void currentSignalColor() {
        this.signalColor = SignalColor.GREEN;
        currentColor(this.signalColor);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.updateObserver();
        }
    }

}
