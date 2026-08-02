package org.example;

public class IdleState implements ElevatorState{
    Elevator elevator;
    public IdleState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void idle() {
        System.out.println("IDLE state!!!!");
    }

    @Override
    public Direction getElevatorDirection() {
        return Direction.IDLE;
    }
}
