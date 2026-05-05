package org.example.Enums;

public enum Denominations {
    HUNDRED(100),
    FIVEHUNDRED(500),
    THOUSAND(1000);
    private int value;
    Denominations(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
