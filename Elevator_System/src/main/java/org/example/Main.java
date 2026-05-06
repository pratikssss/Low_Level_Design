package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = ElevatorSystem.getInstance(4,3);
        Request request = new Request(2,4, Direction.UP);
        elevatorSystem.callLift(request);
    }
}

// 1. Singleton pattern for creating the elevator system
// 2. State pattern for the state of lift (when lift is called up or down, it moves up and then comes to idle state which is handled by state pattern)
// 3. Observer pattern is used to notify all the floors the lift which is in motion and is on what floor