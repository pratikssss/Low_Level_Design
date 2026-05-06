package org.example;

public class FloorPanel implements FloorPanelObserver{
    int floor;
    public FloorPanel(int floor) {
        this.floor = floor;
    }

    @Override
    public void update(Elevator elevator) {
        System.out.println("Elevator "+elevator.id + " is at "+elevator.currentFloor+ " on floor panel "+floor);
    }
}
