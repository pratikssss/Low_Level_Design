package org.example;

public class Car implements Vehicle{
    VehicleType vehicleType;
    String licenceNumber;
    Car(String licenceNumber) {
        this.licenceNumber = licenceNumber;
        this.vehicleType = VehicleType.MEDIUM;
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
