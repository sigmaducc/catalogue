package com.adnan.striver.arrays.hard;

// Leetcode 152: MEDIUM

// Approach: After much brainstorming we can find that going through the
// array from left to right and right to left and calculating prefix and
// suffix is the best way to solve this problem. Trick is whenever we encounter
// product as 0 we can really forget about the array elements up until that point.
// So we reset prefix and suffix back to 1.

// NOTE: DO NOT GET STUCK WITH KADANE'S ALGORITHM IT IS REALLY NON-INTUITVE

public class MaximumProductSubarray {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prefix = 1; int suffix = 1;

        for(int i = 0; i <= nums.length - 1; i++) {
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[i];
            suffix *= nums[nums.length - 1 - i];
            max = Math.max(max, Math.max(prefix, suffix));
        }

        return max;
    }
}