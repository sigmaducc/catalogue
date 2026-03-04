package com.adnan.design_patterns.strategy_pattern.payment_strategy;

public class UpiPayment implements PaymentStrategy {

    private final String upiID;

    public UpiPayment(String upiID) {
        this.upiID = upiID;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by UPI: " + this.upiID);
    }

}