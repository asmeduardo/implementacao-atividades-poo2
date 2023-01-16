package com.helloworld.factory;
import com.helloworld.printer.Printer;
import com.helloworld.printer.ScreenPrinter;

// ScreenFactory class that implements the AbstractFactory interface
public class ScreenFactory implements AbstractFactory {

    @Override
    public Printer getPrinter() {
        return new ScreenPrinter();
    }

}
