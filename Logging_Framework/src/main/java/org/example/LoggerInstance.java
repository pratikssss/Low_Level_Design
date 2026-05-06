package org.example;

import org.example.Enums.LoggerType;
import org.example.Observers.ConsoleObserver;
import org.example.Observers.FileSystemObserver;
import org.example.Observers.Observer;

public class LoggerInstance {
    private LoggerHandler loggerHandler;
    private InfoLogger infoLogger = new InfoLogger();
    private DebugLogger debugLogger = new DebugLogger();
    private ErrorLogger errorLogger = new ErrorLogger();
    private Observer consoleObserver = new ConsoleObserver();
    private Observer fileSystemObserver = new FileSystemObserver();
    public LoggerInstance() {
        this.loggerHandler = infoLogger;
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
        infoLogger.addObservers(consoleObserver);
        debugLogger.addObservers(consoleObserver);
        errorLogger.addObservers(consoleObserver);
        errorLogger.addObservers(fileSystemObserver);
    }
    public static LoggerInstance instance() {
        return new LoggerInstance();
    }

    public void logMessage(LoggerType loggerType) {
        loggerHandler.logMessage(loggerType);
    }
}
