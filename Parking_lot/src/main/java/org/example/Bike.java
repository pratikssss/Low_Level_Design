package org.example;

public class Bike implements Vehicle{
        String licenceNumber;
        VehicleType vehicleType;
        Bike(String licenceNumber) {
            this.licenceNumber = licenceNumber;
            this.vehicleType = VehicleType.SMALL;
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
