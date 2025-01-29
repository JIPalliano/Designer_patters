package org.example.designe_patters.domain.pay.strategy;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@Service
public class Pix implements PayStrategy{

    @Override
    public Mono<String> pay(BigDecimal amount) {
        return Mono.create(sink-> {
            try {
                sink.success("Your choice is Pix, this is value: "+amount);
            } catch (Exception e) {
                sink.error(e);
            }
        });
    }

    @Override
    public Mono<PaymentType> getStrategyType() {
        return Mono.create(sink-> {
            try {
                sink.success(PaymentType.PIX);
            } catch (Exception e) {
                sink.error(e);
            }});
    }
}
