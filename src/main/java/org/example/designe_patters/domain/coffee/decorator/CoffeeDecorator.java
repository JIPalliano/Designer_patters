package org.example.designe_patters.domain.coffee.decorator;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    @Override
    public Mono<String> getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public Mono<Double> cost() {
        return decoratedCoffee.cost();
    }

}
