package org.example.designe_patters.domain.coffee.decorator;


public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() +", with Caramel";
    }

    @Override
    public Double cost() {
        return decoratedCoffee.cost() + 2.5;
    }

}
