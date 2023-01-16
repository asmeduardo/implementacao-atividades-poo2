package com.pizzaria.pizza;

public class PepperoniPizzaFactory implements PizzaFactory {
    public Pizza createPizza() {
        return new PepperoniPizza();
    }

}
