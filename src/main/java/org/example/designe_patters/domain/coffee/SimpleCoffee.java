package org.example.designe_patters.domain.coffee;

import org.example.designe_patters.domain.coffee.decorator.Coffee;
import org.example.designe_patters.domain.coffee.decorator.builder.CoffeeBuilder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SimpleCoffee implements Coffee {

    @Override
    public Mono<String> getDescription() {
        return Mono.just("Simple Coffee");
    }

    @Override
    public Mono<Double> cost() {
        return Mono.just(0.5);
    }

    public Mono<String> getCustomCoffee() {
        return Mono.just(new CoffeeBuilder()
                .addMocha()
                .addMilk()
                .addWippedCream()
                .build());
    }

}
