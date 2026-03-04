package com.adnan.design_patterns.strategy_pattern.sort_strategy;

public class Main {
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        Sorter sorter = new Sorter(new BubbleSort());
        sorter.sort(nums);

        sorter.setSortStrategy(new MergeSort());
        sorter.sort(nums);
    }
}