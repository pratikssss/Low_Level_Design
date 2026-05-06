package org.example;

import java.util.UUID;

public class VehicleCreation {
    public static Vehicle getVehicle(String vehicle) {
        if ("Bike".equalsIgnoreCase(vehicle)) {
            return new Bike(UUID.randomUUID().toString());
        }
        else  if ("Car".equalsIgnoreCase(vehicle)) {
            return new Car(UUID.randomUUID().toString());
        }
        else if ("Truck".equalsIgnoreCase(vehicle)) {
            return new Truck(UUID.randomUUID().toString());
        }
        return null;
    }
}


