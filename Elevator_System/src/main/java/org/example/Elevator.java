package org.example;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    int capacity;
    int currentFloor;
    List<Integer> requests;
    ElevatorState elevatorState;
    int id;
    public Elevator(int capacity, int currentFloor, int id) {
        this.capacity = capacity;
        this.currentFloor = currentFloor;
        this.requests = new ArrayList<>();
        this.elevatorState = new IdleState(this);
        this.id = id;
    }
    public void setState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }
    public ElevatorState getElevatorState() {
        return this.elevatorState;
    }
}
