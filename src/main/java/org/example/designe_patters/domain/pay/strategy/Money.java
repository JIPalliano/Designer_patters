package org.example.designe_patters.domain.pay.strategy;

import java.math.BigDecimal;

public class Money implements PayStrategy{
    @Override
    public String pay(BigDecimal amount) {
        return "Your choice is Money, this is value: "+amount;
    }

    @Override
    public String getStrategyType() {
        return "Money";
    }
}
