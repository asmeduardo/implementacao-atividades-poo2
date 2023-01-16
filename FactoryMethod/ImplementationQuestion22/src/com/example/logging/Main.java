package com.example.logging;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual será o tipo de log (arquivo/console)? ");
        String logType = sc.next();

        Logging logging = LoggingFactory.createLogging(logType);
        for (int i = 1; i <= 10; i++) {
            logging.log(String.valueOf(i));
        }

        sc.close();
    }
}