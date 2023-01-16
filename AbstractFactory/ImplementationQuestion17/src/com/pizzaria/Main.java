package com.pizzaria;
import java.util.Scanner;

import com.pizzaria.pizza.Pizza;
import com.pizzaria.pizza.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana (formato dd/mm/aaaa): ");
        String input = sc.nextLine();
        PizzaFactory factory = Pizzaria.getPizzaFactory(Pizzaria.getDayOfWeek(input));
        if (factory != null) {
            Pizza pizza = factory.createPizza();
            pizza.getIngredients();
        }

        sc.close();
    }
}
