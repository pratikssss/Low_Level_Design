package org.example;

import java.util.List;

import static java.lang.Math.abs;

public class StrategyDefault implements ElevatorStrategy{

    @Override
    public Elevator findElevator(List<Elevator> elevatorList, Request request) {
            Direction direction = request.direction;
            int dist = Integer.MAX_VALUE;
            Elevator availableElevator = null;
            for (Elevator elevator:elevatorList) {
                if (elevator.getElevatorState().getElevatorDirection() == Direction.IDLE) {
                    if (dist > abs(request.requestedFloor - elevator.currentFloor)) {
                        dist = abs(request.requestedFloor - elevator.currentFloor);
                        availableElevator = elevator;
                    }
                }
                else if ((elevator.getElevatorState().getElevatorDirection() == Direction.UP) && request.requestedFloor > elevator.currentFloor && (dist > abs(request.requestedFloor - elevator.currentFloor))) {
                      dist = abs(request.requestedFloor - elevator.currentFloor);
                      availableElevator = elevator;
                }
                else if ((elevator.getElevatorState().getElevatorDirection() == Direction.DOWN) && request.requestedFloor < elevator.currentFloor && (dist > abs(request.requestedFloor - elevator.currentFloor))) {
                    dist = abs(request.requestedFloor - elevator.currentFloor);
                    availableElevator = elevator;
                }
            }
            return availableElevator;
    }
}
