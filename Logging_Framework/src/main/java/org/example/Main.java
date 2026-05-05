package org.example;

import org.example.Enums.LoggerType;
public class Main {
    public static void main(String[] args) {
            LoggerInstance loggerInstance = LoggerInstance.instance();
            loggerInstance.logMessage(LoggerType.INFO);
            loggerInstance.logMessage(LoggerType.DEBUG);
            loggerInstance.logMessage(LoggerType.ERROR);
    }
}

// chain of responsibility pattern (Logger system)
// observer pattern for diff type of platforms for logging. For InfoLogger and DebugLogger ConsoleObserver is there and for error
// both console and fileSystem Observer is there.