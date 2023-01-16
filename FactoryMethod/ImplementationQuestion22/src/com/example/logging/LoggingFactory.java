package com.example.logging;

public class LoggingFactory {
    public static Logging createLogging(String type) {
        if (type.equals("arquivo")) {
            return new FileLogging();
        } else if (type.equals("console")) {
            return new ConsoleLogging();
        }
        return null;
    }
}