package org.example;

public enum VehicleType {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);
    final int value;
    VehicleType(int value) {
        this.value = value;
    }
}
