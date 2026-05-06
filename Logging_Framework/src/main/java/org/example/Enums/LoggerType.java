package org.example.Enums;

public enum LoggerType {
    INFO(1),
    DEBUG(2),
    ERROR(3);
    private final int level;
    LoggerType(int val) {
        level = val;
    }
    public int getLevel() {
        return level;
    }
}
