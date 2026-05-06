package org.example;

import java.util.List;

public interface FloorPanelSubject {
    public void addObservers(FloorPanelObserver o);
    public void removeObservers(FloorPanelObserver o);
    public void updateObservers(int floor, List<ParkingSlot> parkingSlotList);
}
