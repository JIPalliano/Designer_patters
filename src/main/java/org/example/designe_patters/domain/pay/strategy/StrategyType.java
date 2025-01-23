package org.example.designe_patters.domain.pay.strategy;

public enum StrategyType{
    CREDIT_CARD(new CreditCard()),
    DEBIT_CARD(new DebitCard()),
    MONEY(new Money()),
    PIX(new Pix());

    StrategyType(PayStrategy payStrategy){
    }

}