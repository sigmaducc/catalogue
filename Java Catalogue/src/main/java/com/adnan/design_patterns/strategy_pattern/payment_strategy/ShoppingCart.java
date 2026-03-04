package com.adnan.design_patterns.strategy_pattern.payment_strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<CartItem> cartItems = new ArrayList<>();
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        if(this.paymentStrategy == null) throw new IllegalStateException("Payment Strategy not set");
        return this.paymentStrategy;
    }

    public List<CartItem> getCartItems() {
        return this.cartItems;
    }

    public void addItem(CartItem cartItem) {
        this.cartItems.add(cartItem);
    }

    public void updateItem(String id, CartItem cartItem) {
        for(CartItem item: this.cartItems) {
            if(item.id().equals(id)) {
                this.cartItems.remove(item);
                this.cartItems.add(cartItem);

                return;
            }
        }
    }

    public void deleteItem(String id) {
        for(CartItem item: this.cartItems) {
            if(item.id().equals(id)) {
                this.cartItems.remove(item);

                return;
            }
        }
    }

    public void checkout() {
        double totalAmount = 0;
        for(CartItem item: this.cartItems) {
            totalAmount += item.price() * item.quantity();
        }

        if(this.paymentStrategy == null)
            throw new IllegalStateException("Payment strategy is not set");

        paymentStrategy.pay(totalAmount);
    }

}