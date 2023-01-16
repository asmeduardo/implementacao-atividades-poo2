package com.helloworld;
import java.util.Random;

import com.helloworld.factory.AbstractFactory;
import com.helloworld.factory.FileFactory;
import com.helloworld.factory.ScreenFactory;
import com.helloworld.printer.Printer;

public class Main {
    public static void main(String[] args) throws Exception {
        // Generate a random number between 0 and 1
        Random random = new Random();
        int choice = random.nextInt(2);

        // Choose the appropriate factory based on the random number
        AbstractFactory factory;
        if (choice == 0) {
            factory = new ScreenFactory();
        } else {
            factory = new FileFactory();
        }

        // Get the printer from the factory
        Printer printer = factory.getPrinter();
        // Print the message
        printer.print("Hello World!");
    }
}
