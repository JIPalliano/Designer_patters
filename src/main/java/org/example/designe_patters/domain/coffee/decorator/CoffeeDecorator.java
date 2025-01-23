package org.example.designe_patters.domain.coffee.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class CoffeeDecorator implements Coffee {
    Coffee decoratedCoffee;

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public Double cost() {
        return decoratedCoffee.cost();
    }

}
