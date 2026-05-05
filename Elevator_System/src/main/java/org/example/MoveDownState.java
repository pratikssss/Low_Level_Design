package org.example;

public class MoveDownState implements ElevatorState{
    Elevator elevator;
    public MoveDownState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void moveUp() {
    }

    @Override
    public void moveDown() {
        elevator.currentFloor--;
        ElevatorSystem.getNormalInstance().notifyAllPanel(elevator);
        System.out.println("Elevator is at "+elevator.currentFloor + " currently!");
        elevator.setState(new MoveDownState(elevator));
    }

    @Override
    public void idle() {
        elevator.setState(new IdleState(elevator));
    }

    @Override
    public Direction getElevatorDirection() {
        return Direction.DOWN;
    }
}
