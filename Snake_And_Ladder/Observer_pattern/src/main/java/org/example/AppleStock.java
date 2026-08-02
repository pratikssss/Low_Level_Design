package org.example;

import java.util.ArrayList;
import java.util.List;

public class AppleStock implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void updateObservers(int stockPrice) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(stockPrice);
        }
    }
}
