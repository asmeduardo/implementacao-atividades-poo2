package com.pizzaria.pizza;

public class HamPizzaFactory implements PizzaFactory {
    public Pizza createPizza() {
        return new HamPizza();
    }
    
}