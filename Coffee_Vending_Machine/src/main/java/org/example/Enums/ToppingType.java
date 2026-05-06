package org.example.Enums;

public enum ToppingType {
    EXTRA_SUGAR(5),
    CARAMEL_SYRUP(10);
    private final int value;

    ToppingType(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}
