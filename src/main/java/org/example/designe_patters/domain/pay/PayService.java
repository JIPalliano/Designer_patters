package org.example.designe_patters.domain.pay;

import lombok.AllArgsConstructor;
import org.example.designe_patters.domain.pay.strategy.PayStrategy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class PayService {

    private final List<PayStrategy> payStrategies;

    Map<String, PayStrategy> payment;

    public String pay(BigDecimal amount, String type) {
        payStrategies.forEach(payStrategy -> payment.put(payStrategy.getStrategyType(), payStrategy));
        return payment.get(type).pay(amount);
    }

}
