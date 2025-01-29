package org.example.designe_patters.domain.coffee.decorator;

import reactor.core.publisher.Mono;

public interface Coffee {

    Mono<String> getDescription();

    Mono<Double> cost();


}
