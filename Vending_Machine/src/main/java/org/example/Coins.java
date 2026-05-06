package org.example;

public enum Coins {
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50);

    private final int value;
    Coins(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
