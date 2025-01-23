package org.example.designe_patters.domain.coffee.decorator;

public class WippedCreamDecorator extends CoffeeDecorator {
    public WippedCreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() +", with Wipped cream";
    }

    @Override
    public Double cost() {
        return decoratedCoffee.cost() + 1.5;
    }

}
