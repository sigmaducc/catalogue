package com.adnan.design_patterns.strategy_pattern.payment_strategy;

public class DebitCardPayment implements PaymentStrategy {

    private final String debitCardNumber;

    public DebitCardPayment(String debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by debit card: " + this.debitCardNumber);
    }

}