package com.example.logging;

public class ConsoleLogging implements Logging {
    public void log(String message) {
        System.out.println(message);
    }
}