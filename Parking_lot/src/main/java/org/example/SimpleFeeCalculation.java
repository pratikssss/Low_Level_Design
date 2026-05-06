package org.example;

public class SimpleFeeCalculation implements FeeCalculationStrategy{
    Vehicle vehicle;
    public SimpleFeeCalculation(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void fee() {
        if (vehicle.vehicleType() == VehicleType.SMALL) {
            System.out.println("Fee calculated is 10");
        }
        else if (vehicle.vehicleType() == VehicleType.MEDIUM) {
            System.out.println("Fee calculated is 50");
        }
        else if (vehicle.vehicleType() == VehicleType.LARGE) {
            System.out.println("Fee calculated is 100");
        }
    }
}
