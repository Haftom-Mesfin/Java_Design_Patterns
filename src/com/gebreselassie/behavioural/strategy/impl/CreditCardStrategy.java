package com.gebreselassie.behavioural.strategy.impl;

import com.gebreselassie.behavioural.strategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String creditNmuber;
    private String cvv;
    private String expirationDate;

    public CreditCardStrategy(String name, String creditNmuber, String cvv, String expirationDate) {
        this.name = name;
        this.creditNmuber = creditNmuber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with credit / debit card.");
    }
}
