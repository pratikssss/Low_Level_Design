package org.example;

public interface Subject {
    public void addObserver(Observer o);
    public void notifyObservers();
}
