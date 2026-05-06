package org.example;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
     public void addObserver(Observer o);
     public void removeObserver(Observer o);
     public void updateObservers(int stockPrice);
}
