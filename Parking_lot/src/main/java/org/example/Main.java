package org.example;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
            FloorPanelObserver mainEntranceScreen = new FloorDisplayBoard("Main Entrance Screen");
            FloorPanelObserver firstFloorScreen = new FloorDisplayBoard("First Floor Screen");
            FloorPanelObserver secondFloorScreen = new FloorDisplayBoard("Second Floor Screen");
            ParkingLotSystem parkingLotSystem = ParkingLotSystem.getInstance();
            ParkingFloor parkingFloor1 = new ParkingFloor(1,3);
            parkingLotSystem.addParkingFloor(parkingFloor1);
            parkingFloor1.addObservers(mainEntranceScreen);
            parkingFloor1.addObservers(firstFloorScreen);
            ParkingFloor parkingFloor2 = new ParkingFloor(2,3);
            parkingLotSystem.addParkingFloor(parkingFloor2);
            parkingFloor2.addObservers(mainEntranceScreen);
            parkingFloor2.addObservers(secondFloorScreen);
//          parkingLotSystem.availableSpotsOnAFloor();
            Vehicle vehicle1 = VehicleCreation.getVehicle("Bike");
            parkingLotSystem.findParkingSpot(vehicle1, new FindNearestParking());
            Vehicle vehicle2 = VehicleCreation.getVehicle("Bike");
            parkingLotSystem.findParkingSpot(vehicle2, new FindNearestParking());
//          parkingLotSystem.availableSpotsOnAFloor();
    }
}

// 1. Singleton pattern to create ParkingLotSystem
// 2. Strategy pattern to find parking spot and fee calculations
// 3. Observer pattern to update the screens on floors (if any change is made on first floor then update first floor screen as well as main entrance screen)
// 4. Factory pattern to create vehicles