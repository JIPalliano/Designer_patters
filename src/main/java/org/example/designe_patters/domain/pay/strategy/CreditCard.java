package org.example.designe_patters.domain.pay.strategy;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CreditCard implements PayStrategy{

    @Override
    public String pay(BigDecimal amount) {
        return "Your choice is CreditCard, this is value: "+amount;
    }

    @Override
    public String getStrategyType() {
        return "CreditCard";
    }
}
