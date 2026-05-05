package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLotSystem {
    private static volatile ParkingLotSystem instance;
    List<ParkingFloor> parkingFloors;
    Map<String, ParkingSlot> parkingSlotVehicleMap;
    private ParkingLotSystem() {
        this.parkingFloors = new ArrayList<>();
        this.parkingSlotVehicleMap = new HashMap<>();
    }
    public static ParkingLotSystem getInstance() {
        // First check (no locking, fast)
        if (instance ==  null) {
            // Lock the class only if instance is null
            synchronized (ParkingLotSystem.class) {
                // Second check (inside the lock, safe)
                if (instance == null) {
                    instance = new ParkingLotSystem();
                }
            }
        }
        return instance;
    }

    public void availableSpotsOnAFloor() {
        for (var i = 0; i < parkingFloors.size(); i++) {
            List<ParkingSlot> parkingSlots= parkingFloors.get(i).parkingSlotList;
            for (var j = 0; j < parkingSlots.size(); j++) {
                if (!parkingSlots.get(j).isOccupied) {
                    System.out.println("Slot "+parkingSlots.get(j).canOccupyVehicleType + " is available at "+parkingFloors.get(i).floorNumber+" floor");
                }
            }
        }
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        parkingFloors.add(parkingFloor);
    }

    public void findParkingSpot(Vehicle vehicle, FindNearestParking findNearestParking) {
        ParkingSlot parkingSlotFound = findNearestParking.findAvailableSlot(vehicle,this.parkingFloors);
        if (parkingSlotFound == null) {
            System.out.println("Sorry, no parking slot available");
        }
        else {
            System.out.println("Found id " + parkingSlotFound.id + " of parking slot and it can accomodate " + parkingSlotFound.canOccupyVehicleType+ " vehicles.");
            parkVehicle(parkingSlotFound,vehicle);
        }
    }

    public void parkVehicle(ParkingSlot parkingSlotFound, Vehicle vehicle) {
        parkingSlotVehicleMap.put(vehicle.getLicenseNumber(),parkingSlotFound);
        parkingSlotFound.isOccupied = true;
        ParkingFloor parkingfloor = getFloorByNumber(parkingSlotFound.floor);
        parkingfloor.updateObservers(parkingSlotFound.floor,parkingfloor.parkingSlotList);
    }

    private ParkingFloor getFloorByNumber(int floor) {
        return parkingFloors.get(floor-1);
    }

    public void unparkVehicle(Vehicle vehicle) {
        ParkingSlot parkingSlot = parkingSlotVehicleMap.get(vehicle.getLicenseNumber());
        parkingSlot.isOccupied = false;
        ParkingFloor parkingfloor = getFloorByNumber(parkingSlot.floor);
        parkingfloor.updateObservers(parkingSlot.floor, parkingfloor.parkingSlotList);
        FeeCalculationStrategy feeStrategy = new SimpleFeeCalculation(vehicle);
        feeStrategy.fee();
        parkingSlotVehicleMap.remove(vehicle.getLicenseNumber());
    }

}
