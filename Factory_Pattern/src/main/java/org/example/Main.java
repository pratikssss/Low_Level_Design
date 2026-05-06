package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.VehicleFactory("Bike");
        if (vehicle != null)
        vehicle.drive();
    }
}

// Factory pattern
//When to use it in interviews: When you need to create different types of similar objects based on some input.
// For example: creating different Vehicle types in a Parking Lot, or different Notification types (Email, SMS, Push).

