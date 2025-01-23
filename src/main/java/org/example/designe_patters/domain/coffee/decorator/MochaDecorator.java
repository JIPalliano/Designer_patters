package org.example.designe_patters.domain.coffee.decorator;

public class MochaDecorator extends CoffeeDecorator{
    public MochaDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() +", with Mocha";
    }

    @Override
    public Double cost() {
        return decoratedCoffee.cost() + 1.0;
    }

}
