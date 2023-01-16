package com.helloworld.printer;
// ScreenPrinter class that implements the Printer interface
public class ScreenPrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println(message);
    }

}
