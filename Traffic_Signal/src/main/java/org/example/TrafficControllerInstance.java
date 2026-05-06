package org.example;

import org.example.Enums.SignalColor;
import org.example.Strategy.RoundRobin;
import org.example.TrafficSignal.*;

import java.util.ArrayList;
import java.util.List;

public class TrafficControllerInstance {
    private static volatile TrafficControllerInstance trafficControllerInstance;
    private List<TrafficSignal> trafficSignalList = new ArrayList<>();
    private SignalColor currentSignalColor;
    public TrafficControllerInstance() {
        TrafficSignal eastTrafficSignal = TrafficSignalFactory.createTrafficSignal("East");
        TrafficSignal westTrafficSignal = TrafficSignalFactory.createTrafficSignal("West");
        TrafficSignal northTrafficSignal = TrafficSignalFactory.createTrafficSignal("North");
        TrafficSignal southTrafficSignal = TrafficSignalFactory.createTrafficSignal("South");
        this.trafficSignalList.add(eastTrafficSignal);
        this.trafficSignalList.add(westTrafficSignal);
        this.trafficSignalList.add(northTrafficSignal);
        this.trafficSignalList.add(southTrafficSignal);
        Observer a = VehicleFactory.createVehicle("a");
        Observer b = VehicleFactory.createVehicle("b");
        Observer c = VehicleFactory.createVehicle("c");
        Observer d = VehicleFactory.createVehicle("d");
        eastTrafficSignal.addObserver(a);
        eastTrafficSignal.addObserver(b);
        westTrafficSignal.addObserver(c);
        westTrafficSignal.addObserver(d);
    }
    public static TrafficControllerInstance getTrafficControllerInstance() {
        if (trafficControllerInstance == null) {
            // Lock the class only if instance is null
            synchronized (TrafficControllerInstance.class) {
                // Second check (inside the lock, safe)
                if (trafficControllerInstance == null) {
                    trafficControllerInstance = new TrafficControllerInstance();
                }
            }
        }
        return trafficControllerInstance;
    }

    public void startTrafficSignal() {
        StrategyInterface roundRobinStrategy = new RoundRobin();
        roundRobinStrategy.strategy(trafficSignalList);
    }
    public void handleEmergency(String signal) {
        for(TrafficSignal trafficSignal:trafficSignalList) {
            if(!trafficSignal.signalId().equalsIgnoreCase(signal)) {
                trafficSignal.setStateToRed();
            }
            else {
                trafficSignal.currentSignalColor();
            }
        }
    }
}
