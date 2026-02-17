package com.adnan.striver.arrays.medium;

import java.util.HashMap;
import java.util.Map;

// Leetcode 560: MEDIUM

// Refer LongestSubarrayWithSumK before solving this.

public class SubarraySumEqualsK {

    // Time Complexity: O(n * n) ~ O(N^2)
    // Space Complexity: O(1)
//    public int subarraySum(int[] nums, int k) {
//        int counter = 0;
//
//        for(int i = 0; i <= nums.length - 1; i++) {
//            long sum = 0;
//            for(int j = i; j <= nums.length - 1; j++) {
//                sum += nums[j];
//
//                if(sum == k) counter++;
//            }
//        }
//
//        return counter;
//    }

    // Time Complexity: O(n * 1) or O(n * n) ~ O(n) - O(n^2)
    // This is because the number of collisions in hashmap could cause trouble. Hence, it worst case it might take O(n^2)
    // and in best case it might take O(1)
    // Space Complexity: O(n)
    public int subarraySum(int[] nums, int k) {
        Map<Long, Integer> map = new HashMap<>();
        int counter = 0;

        long sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            long diff = sum - k;

            if(map.containsKey(diff)) {
                counter += map.get(diff);
            }

            if(map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }

            if(sum == k) counter++;
        }

        return counter;
    }
}