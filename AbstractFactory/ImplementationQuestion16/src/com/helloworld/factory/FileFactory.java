package com.helloworld.factory;
import com.helloworld.printer.FilePrinter;
import com.helloworld.printer.Printer;

// FileFactory class that implements the AbstractFactory interface
public class FileFactory implements AbstractFactory {

    @Override
    public Printer getPrinter() {
        return new FilePrinter();
    }

}
