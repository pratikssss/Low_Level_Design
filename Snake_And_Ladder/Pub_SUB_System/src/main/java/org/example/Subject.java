package org.example;

public interface Subject {
    void addObserver(Observer var1);
    void removeObserver(Observer var1);
    void publish(Message var1);
}
