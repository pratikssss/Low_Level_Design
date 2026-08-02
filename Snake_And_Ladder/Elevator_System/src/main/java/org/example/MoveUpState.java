package org.example;

public class MoveUpState implements ElevatorState{
    Elevator elevator;
    public MoveUpState(Elevator elevator) {
        this.elevator = elevator;
    }
    @Override
    public void moveUp() {
        elevator.currentFloor++;
        ElevatorSystem.getNormalInstance().notifyAllPanel(elevator);
        System.out.println("Elevator is at "+elevator.currentFloor + " currently!");
        elevator.setState(new MoveUpState(elevator));
    }

    @Override
    public void moveDown() {

    }

    @Override
    public void idle() {
        elevator.setState(new IdleState(elevator));
        elevator.getElevatorState().idle();
    }

    @Override
    public Direction getElevatorDirection() {
        return Direction.UP;
    }
}
