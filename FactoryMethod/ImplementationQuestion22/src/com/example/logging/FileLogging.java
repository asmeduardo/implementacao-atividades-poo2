package com.example.logging;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogging implements Logging {
    public void log(String message) {
        try {
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write(message + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}