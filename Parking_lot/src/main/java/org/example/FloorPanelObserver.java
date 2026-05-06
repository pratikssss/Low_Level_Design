package org.example;

import java.util.List;

public interface FloorPanelObserver {
    void update(int floorNumber, List<ParkingSlot> parkingSlotList);
}
