package org.example;

public interface ElevatorState {
    public void moveUp();
    public void moveDown();
    public void idle();
    public Direction getElevatorDirection();
}
