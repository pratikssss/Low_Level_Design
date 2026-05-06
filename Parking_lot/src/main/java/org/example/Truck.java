package org.example;

public class Truck implements Vehicle{
    VehicleType vehicleType;
    String licenceNumber;
    Truck(String licenceNumber) {
        this.licenceNumber = licenceNumber;
        this.vehicleType = VehicleType.LARGE;
    }

    @Override
    public VehicleType vehicleType() {
        return this.vehicleType;
    }

    @Override
    public String getLicenseNumber() {
        return this.licenceNumber;
    }
}
