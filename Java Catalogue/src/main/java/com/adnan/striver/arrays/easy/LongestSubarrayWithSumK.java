package com.adnan.striver.arrays.easy;

import java.util.HashMap;
import java.util.Map;

// Non LeetCode question (but from striver sheet)
// DONE: Try sliding window for positive integers
// Check LongestSubarrayWithSumKWithPositives

public class LongestSubarrayWithSumK {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int longestSubarray(int[] nums, int k) {
        Map<Long, Integer> map = new HashMap<>();

        long sum = 0;
        int len = 0;
        for(int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];
            long diff = sum - k;

            if(map.containsKey(diff)) {
                len = Math.max(len, i - map.get(diff));
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if(sum == k) len = Math.max(len, i + 1);
        }

        return len;
    }
}