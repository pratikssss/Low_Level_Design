package org.example;

import org.example.Enums.LoggerType;

public abstract class LoggerHandler {
    private LoggerHandler nextLogger;
    protected int handlerLevel;
    public void setNextLogger(LoggerHandler nextLogger) {
        this.nextLogger = nextLogger;
    }
    public abstract void log();
    public abstract void notifyObservers();
    public void logMessage(LoggerType loggerType) {
        if(this.handlerLevel == loggerType.getLevel()) {
            this.log();
            this.notifyObservers();
        }
        else {
            nextLogger.logMessage(loggerType);
        }
    }

}
