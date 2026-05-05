package org.example;

import org.example.TrafficSignal.TrafficSignal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TrafficControllerInstance trafficControllerInstance = TrafficControllerInstance.getTrafficControllerInstance();
        trafficControllerInstance.startTrafficSignal();
        System.out.println("Ambulance comes from south direction!!!!!!");
        trafficControllerInstance.handleEmergency("South");
    }
}

// 4 traffic signals are there in east, west, north, south
// singleton pattern used to create the system (TrafficControllerInstance)
// Strategy pattern is used to determine by which strategy we want to change colors of signals
// Factory pattern used to create objects like TrafficSignal and Vehicle (created vehicleFactory and TrafficSignalFactory)
// When ambulance comes from a particular direction then we need to make all other signals RED.
// Observer pattern used to notify the vehicle on the road (basically the signal i.e east,west,north,south) about the signal turning green