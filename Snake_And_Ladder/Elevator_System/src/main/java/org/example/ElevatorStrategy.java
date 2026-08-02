package org.example;

import java.util.List;

public interface ElevatorStrategy {
   public Elevator findElevator(List<Elevator> elevatorList, Request request);
}
