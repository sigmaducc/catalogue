package com.adnan.striver.arrays.easy;

// Leetcode 1752: EASY

// Check how many times the graph goes down when comparing consecutive elements.
// If the graph goes down 0 or 1 times it means the array is rotatable. If there
// are more than 1 graph down instances then it means something is messed up
// with the array;

public class CheckIfArrayIsSortedAndRotated {
    public boolean isArraySortedAndRotated(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i])
                count++;
        }

        if (nums[n - 1] > nums[0])
            count++;

        return count <= 1;
    }
}