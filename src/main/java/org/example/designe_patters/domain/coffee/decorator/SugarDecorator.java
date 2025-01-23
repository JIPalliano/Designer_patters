package org.example.designe_patters.domain.coffee.decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() +", with sugar";
    }

    @Override
    public Double cost() {
        return decoratedCoffee.cost() + 0.5;
    }
}
