package com.pizzaria;

import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import com.pizzaria.pizza.HamPizzaFactory;
import com.pizzaria.pizza.PepperoniPizzaFactory;
import com.pizzaria.pizza.PizzaFactory;

public class Pizzaria {
    public static PizzaFactory getPizzaFactory(String day) {
        System.out.println(day);
        if (day.equalsIgnoreCase("SEG.") || day.equalsIgnoreCase("QUA.")
                || day.equalsIgnoreCase("SEX.")) {
            return new PepperoniPizzaFactory();
        } else if (day.equalsIgnoreCase("TER.") || day.equalsIgnoreCase("QUI.")
                || day.equalsIgnoreCase("SÁB.")) {
            return new HamPizzaFactory();
        } else {
            System.out.println("A pizzaria fecha aos domingos.");
            return null;
        }
    }

    public static String getDayOfWeek(String data) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        DayOfWeek dow = DayOfWeek.from(parser.parse(data));
        return dow.getDisplayName(TextStyle.SHORT, new Locale("pt", "BR")).toUpperCase();
    }

}