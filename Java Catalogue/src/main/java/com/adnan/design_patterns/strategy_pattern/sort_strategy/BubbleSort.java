package com.adnan.design_patterns.strategy_pattern.sort_strategy;

public class BubbleSort implements SortStrategy {

    @Override
    public void sort(int[] nums) {
        System.out.println("Bubble Sort");
    }

}