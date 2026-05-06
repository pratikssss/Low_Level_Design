package org.example;

public class InfoLogger extends Logger{
    @Override
    protected void write(String message) {
        System.out.println("Info Logger: "+message);
    }
}
