package org.example;

public class VehicleFactory {
    public static Observer createVehicle(String a) {
        return new Vehicle(a);
    }
}
