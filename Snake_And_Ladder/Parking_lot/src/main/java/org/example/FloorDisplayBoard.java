package org.example;

import java.util.List;

public class FloorDisplayBoard implements FloorPanelObserver {
    String boardName;
    public FloorDisplayBoard(String boardName) {
        this.boardName = boardName;
    }

    @Override
    public void update(int floorNumber, List<ParkingSlot> parkingSlotList) {
        System.out.println(boardName);
        long availableSpots = parkingSlotList.stream().filter(slot -> !slot.isOccupied).count();
        System.out.println("Available spots on floor "+floorNumber+" are "+availableSpots);
    }
}
