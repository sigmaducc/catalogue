package com.adnan.striver.arrays.easy;

// Non LeetCode question (but from striver sheet)

public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax && nums[i] != max) {
                secondMax = nums[i];
            }
        }

        if(secondMax == Integer.MIN_VALUE) return -1;

        return secondMax;
    }
}