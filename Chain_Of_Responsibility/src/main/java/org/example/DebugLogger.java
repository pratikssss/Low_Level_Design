package org.example;

public class DebugLogger extends Logger{
    @Override
    protected void write(String message) {
        System.out.println("Debug Logger: "+message);
    }
}
