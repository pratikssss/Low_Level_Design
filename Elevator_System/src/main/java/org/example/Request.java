package org.example;

public class Request {
    int requestedFloor;
    int destinationFloor;
    Direction direction;
    public Request(int requestedFloor, int destinationFloor, Direction direction) {
        this.destinationFloor = destinationFloor;
        this.requestedFloor = requestedFloor;
        this.direction = direction;
    }
}
