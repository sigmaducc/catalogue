package com.adnan.striver.arrays.easy;

// LeetCode 485: EASY
// https://leetcode.com/problems/max-consecutive-ones/

// Approach: We start counting 1's and as we encounter 0 we update max
// and reset counter. Rinse and repeat. In the end we take one final
// max check because we only check for max when we encounter 0.

public class MaxConsecutiveOnes {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
        for(int i = 0; i <= nums.length - 1; i++) {
            if(nums[i] == 1) {
                counter++;
            } else {
                max = Math.max(max, counter);
                counter = 0;
            }
        }
        max = Math.max(max, counter);

        return max;
    }
}