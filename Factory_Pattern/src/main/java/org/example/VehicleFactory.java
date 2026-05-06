package org.example;

public class VehicleFactory {
    public static Vehicle VehicleFactory(String vehicleType) {
        if ("Bike".equalsIgnoreCase(vehicleType)) {
            return new Bike();
        } else if ("Car".equalsIgnoreCase(vehicleType)) {
            return new Car();
        }
        return null;
    }
}
