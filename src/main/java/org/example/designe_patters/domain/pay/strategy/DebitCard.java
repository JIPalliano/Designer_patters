package org.example.designe_patters.domain.pay.strategy;


import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DebitCard implements PayStrategy {



    @Override
    public String pay(BigDecimal amount) {
        return "Your choice is DebitCard, this is value: "+amount;
    }

    @Override
    public String getStrategyType() {
        return "DebitCard";
    }
}
