package org.example;

public class ParkingSlot {
    int id;
    VehicleType canOccupyVehicleType;
    boolean isOccupied;
    int floor;
    ParkingSlot(int id, VehicleType canOccupyVehicleType, boolean isOccupied, int floor) {
        this.id = id;
        this.canOccupyVehicleType = canOccupyVehicleType;
        this.isOccupied = isOccupied;
        this.floor = floor;
    }
}
