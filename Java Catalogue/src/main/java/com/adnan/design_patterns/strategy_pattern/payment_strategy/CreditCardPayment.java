package com.adnan.design_patterns.strategy_pattern.payment_strategy;

public class CreditCardPayment implements PaymentStrategy {

    private final String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by credit card: " + this.creditCardNumber);
    }

}