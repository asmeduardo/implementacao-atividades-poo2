package com.helloworld.printer;
import java.io.FileWriter;
import java.io.IOException;

// FilePrinter class that implements the Printer interface
public class FilePrinter implements Printer {

    @Override
    public void print(String message) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(message);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
