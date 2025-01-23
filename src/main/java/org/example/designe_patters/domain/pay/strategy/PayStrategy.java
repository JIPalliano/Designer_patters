package org.example.designe_patters.domain.pay.strategy;

import java.math.BigDecimal;

public interface PayStrategy {

    String pay(BigDecimal amount);

    String getStrategyType();

}
