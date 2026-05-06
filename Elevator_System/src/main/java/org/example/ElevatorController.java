package org.example;

public class ElevatorController {
    private final ElevatorSystem elevatorSystem;
    private final Request request;
    Elevator elevator;
    public ElevatorController(ElevatorSystem elevatorSystem, Request request) {
        this.elevatorSystem = elevatorSystem;
        this.request = request;
    }

    public Elevator findLift() {
        ElevatorStrategy currentStrategy = new StrategyDefault();
        return currentStrategy.findElevator(elevatorSystem.getElevators(), this.request);
    }

    public void processRequest(Elevator elevator, int floor) {
        if (elevator.currentFloor < floor) {
            elevator.setState(new MoveUpState(elevator));
            while(floor != elevator.currentFloor) {
                elevator.getElevatorState().moveUp();
            }
            elevator.getElevatorState().idle();
        }
        else if (elevator.currentFloor > floor) {
            elevator.setState(new MoveDownState(elevator));
            while(floor != elevator.currentFloor) {
                elevator.getElevatorState().moveDown();
            }
            elevator.getElevatorState().idle();
        }
        else {
            elevator.setState(new IdleState(elevator));
        }
    }
}
