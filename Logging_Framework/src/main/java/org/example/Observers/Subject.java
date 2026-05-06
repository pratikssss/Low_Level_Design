package org.example.Observers;

public interface Subject {
    public void notifyObservers();
    public void addObservers(Observer o);
}
