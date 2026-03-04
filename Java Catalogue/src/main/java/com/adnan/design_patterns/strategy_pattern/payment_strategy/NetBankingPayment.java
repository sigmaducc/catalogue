package com.adnan.design_patterns.strategy_pattern.payment_strategy;

public class NetBankingPayment implements PaymentStrategy {

    private final String netBankingUsername;
    private final String netBankingPassword;

    public NetBankingPayment(String netBankingUsername, String netBankingPassword) {
        this.netBankingUsername = netBankingUsername;
        this.netBankingPassword = netBankingPassword;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by NetBanking " + this.netBankingUsername);
    }

}