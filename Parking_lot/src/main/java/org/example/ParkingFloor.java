package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParkingFloor implements FloorPanelSubject{
    public static int counter = 1;
    int floorNumber;
    int noOfSlots;
    List<ParkingSlot> parkingSlotList = new ArrayList<>();
    private final List<FloorPanelObserver> observers = new ArrayList<>();
    ParkingFloor(int floorNumber, int noOfSlots) {
        this.floorNumber = floorNumber;
        this.noOfSlots = noOfSlots;
        parkingSlotsFill();
    }
    public void parkingSlotsFill() {
        for (var i = 0; i < 3; i++) {
            if (i == 0) {
                ParkingSlot parkingSlot = new ParkingSlot(counter, VehicleType.SMALL, false,this.floorNumber);
                parkingSlotList.add(parkingSlot);
                counter++;
            } else if (i == 1) {
                ParkingSlot parkingSlot = new ParkingSlot(counter, VehicleType.MEDIUM, false,this.floorNumber);
                parkingSlotList.add(parkingSlot);
                counter++;
            } else {
                ParkingSlot parkingSlot = new ParkingSlot(counter, VehicleType.LARGE, false,this.floorNumber);
                parkingSlotList.add(parkingSlot);
                counter++;
            }
        }
    }

    @Override
    public void addObservers(FloorPanelObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObservers(FloorPanelObserver o) {
        observers.remove(o);
    }

    @Override
    public void updateObservers(int floor, List<ParkingSlot> parkingSlotList) {
         for (FloorPanelObserver observer:observers) {
             observer.update(floor,parkingSlotList);
         }
    }

}
