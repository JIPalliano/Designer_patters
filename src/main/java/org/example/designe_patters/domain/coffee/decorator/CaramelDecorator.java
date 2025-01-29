package org.example.designe_patters.domain.coffee.decorator;


import reactor.core.publisher.Mono;

public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public Mono<String> getDescription() {
        return decoratedCoffee.getDescription()
                .map( description-> description + ", with Caramel");
    }

    @Override
    public Mono<Double> cost() {
        return decoratedCoffee.cost()
                .map(cost -> cost + 2.5);
    }

}
