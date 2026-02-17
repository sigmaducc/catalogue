package com.adnan.striver.arrays.easy;

// LEETCODE 121: EASY

// Approach 1: Try to use bruteforce method. For every price check
// for future price and calculate profit. Future price will always be
// selling price and current price will always be buying price.
// We simply use profit = selling price  - buying price.
// We keep track of max profit and return it at the end.

// Approach 2: we maintain a global minima. When we iterate we simply calculate
// profit for each price based on the local minima. Store this profit in maxProfit.
// Once we have iterated over the whole array we will for sure have global minima.
// In the end simply return the max profit.

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        return maxProfit1(prices);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    private int maxProfit1(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }

            int profit = prices[i] - min;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }


    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    private int maxProfit2(int[] prices) {
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {
            for(int j = i+1; j < prices.length; j++) {
                int buy = prices[i];
                int sell = prices[j];

                int profit = sell - buy;
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}