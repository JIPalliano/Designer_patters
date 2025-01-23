package org.example.designe_patters.domain.coffee.decorator;


public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription()+ ", with milk";
    }

    @Override
    public Double cost() {
        return decoratedCoffee.cost() + 1.0;
    }
}
