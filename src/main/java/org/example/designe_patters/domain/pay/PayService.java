package org.example.designe_patters.domain.pay;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.designe_patters.domain.pay.strategy.PayStrategy;
import org.example.designe_patters.domain.pay.strategy.PaymentType;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Slf4j
@RequiredArgsConstructor
public class PayService {

    private final List<PayStrategy> payStrategies;

    Map<PaymentType, PayStrategy> payment = new HashMap<>();

    @PostConstruct
    public void populateMap() {
        Flux.fromIterable(payStrategies)
                .flatMap(payStrategy -> payStrategy.getStrategyType()
                .doOnNext(strategyType -> payment.put(strategyType, payStrategy)))
                .subscribe();
    }

    public Mono<String> pay(BigDecimal amount, PaymentType type) {
        return Mono.justOrEmpty(payment.get(type))
                .switchIfEmpty(Mono.error(new IllegalArgumentException("Payment strategy not found for type: " + type)))
                .flatMap(strategy -> strategy.pay(amount));
    }
}
