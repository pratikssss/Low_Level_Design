package org.example;

import org.example.TrafficSignal.TrafficSignal;

public class TrafficSignalFactory {
    public static TrafficSignal createTrafficSignal(String east) {
        return new TrafficSignal(east);
    }
}
