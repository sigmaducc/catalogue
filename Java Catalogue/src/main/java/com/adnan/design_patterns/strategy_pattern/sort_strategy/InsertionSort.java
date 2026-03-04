package com.adnan.design_patterns.strategy_pattern.sort_strategy;

public class InsertionSort implements SortStrategy {

    @Override
    public void sort(int[] nums) {
        System.out.println("Insertion Sort");
    }

}