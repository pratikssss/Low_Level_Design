package org.example;

import java.util.List;

public interface StrategyToPark {
    public ParkingSlot findAvailableSlot(Vehicle vehicle, List<ParkingFloor> floors);
    public void setStrategy(StrategyToPark currentStrategy);
}
