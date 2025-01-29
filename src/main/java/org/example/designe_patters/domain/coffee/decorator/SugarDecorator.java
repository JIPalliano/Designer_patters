package org.example.designe_patters.domain.coffee.decorator;

import reactor.core.publisher.Mono;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public Mono<String> getDescription() {
        return decoratedCoffee.getDescription()
                .map(description -> description + ", with sugar");
    }

    @Override
    public Mono<Double> cost() {
        return decoratedCoffee.cost()
                .map(cost -> cost + 0.5);
    }
}
