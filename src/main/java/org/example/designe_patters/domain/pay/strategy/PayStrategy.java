package org.example.designe_patters.domain.pay.strategy;

import reactor.core.publisher.Mono;

import java.math.BigDecimal;

public interface PayStrategy {

    Mono<String> pay(BigDecimal amount);

    Mono<PaymentType> getStrategyType();

}
