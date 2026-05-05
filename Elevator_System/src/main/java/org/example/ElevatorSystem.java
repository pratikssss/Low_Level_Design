package org.example;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    private static volatile ElevatorSystem instance;
    List<Elevator> elevators = new ArrayList<>();
    int noOfElevators;
    int noOfFloors;
    List<FloorPanelObserver> floorPanelObservers = new ArrayList<>();
    private ElevatorSystem(int noOfElevators, int noOfFloors) {
        this.noOfElevators = noOfElevators;
        this.noOfFloors = noOfFloors;
        for (var i = 0; i < noOfElevators; i++) {
                Elevator elevator = new Elevator(4, 1,i+1);
                elevators.add(elevator);
        }
        for (var i = 0; i < noOfFloors; i++) {
            FloorPanel floorPanel = new FloorPanel(i+1);
            floorPanelObservers.add(floorPanel);
        }
    }

    public static ElevatorSystem getInstance(int noOfElevators, int noOfFloors) {
        // First check (no locking, fast)
        if (instance ==  null) {
            // Lock the class only if instance is null
            synchronized (ElevatorSystem.class) {
                // Second check (inside the lock, safe)
                if (instance == null) {
                    instance = new ElevatorSystem(noOfElevators, noOfFloors);
                }
            }
        }
        return instance;
    }

    public static ElevatorSystem getNormalInstance() {
        return instance;
    }

    public List<Elevator> getElevators() {
        return this.elevators;
    }

    public int getNoOfElevators() {
        return this.noOfElevators;
    }

    public int getNoOfFloors() {
        return this.noOfFloors;
    }

    public void callLift(Request request) {
        ElevatorController elevatorController = new ElevatorController(instance, request);
        Elevator elevator = elevatorController.findLift();
        System.out.println(elevator.currentFloor);
        elevatorController.processRequest(elevator,request.requestedFloor);
        elevatorController.processRequest(elevator,request.destinationFloor);
    }

    public void notifyAllPanel(Elevator elevator) {
        for (FloorPanelObserver floorPanelObserver:floorPanelObservers) {
            floorPanelObserver.update(elevator);
        }
    }

}
