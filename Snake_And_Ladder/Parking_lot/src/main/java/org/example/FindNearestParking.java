package org.example;

import java.util.List;

public class FindNearestParking implements StrategyToPark {
    StrategyToPark strategy;
    @Override
    public ParkingSlot findAvailableSlot(Vehicle vehicle, List<ParkingFloor> floors) {
        for (var i = 0; i < floors.size(); i++) {
            List<ParkingSlot> parkingSlots= floors.get(i).parkingSlotList;
            for (var j = 0; j < parkingSlots.size(); j++) {
                if (!parkingSlots.get(j).isOccupied && parkingSlots.get(j).canOccupyVehicleType.value >= vehicle.vehicleType().value) {
                    return parkingSlots.get(j);
                }
            }
        }
        return null;
    }

    @Override
    public void setStrategy(StrategyToPark currentStrategy) {

    }
}
