package org.example.designe_patters.domain.coffee.decorator;

import reactor.core.publisher.Mono;

public class MochaDecorator extends CoffeeDecorator{
    public MochaDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public Mono<String> getDescription() {
        return decoratedCoffee.getDescription()
                .map(description -> description+", with Mocha");
    }

    @Override
    public Mono<Double> cost() {
        return decoratedCoffee.cost()
                .map(cost -> cost + 1.0);
    }

}
