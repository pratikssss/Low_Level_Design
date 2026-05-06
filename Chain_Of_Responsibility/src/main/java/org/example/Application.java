package org.example;

public class Application {
    public static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger();
        Logger infoLogger = new ErrorLogger();
        Logger debugLogger = new ErrorLogger();
        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);
        return errorLogger;
    }
}
