package com.adnan.striver.arrays.easy;

import java.util.HashMap;
import java.util.Map;

// LeetCode 136: EASY
// https://leetcode.com/problems/single-number/

// Approach 1: Use hashmap to store numbers and their count.
// In the end iterate over the hashmap and return the key with value as 1

// Approach 2: Use xor property, since we have 1 single and others as double.
// If we use xor property all the doubles will cancel each other out and
// remaining will be the single value.

public class SingleNumber {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int singleNumber(int[] nums) {
        int xor = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            xor ^= nums[i];
        }

        return xor;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
//    public int singleNumber(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i <= nums.length - 1; i++) {
//            if(map.containsKey(nums[i])) {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            } else {
//                map.put(nums[i], 1);
//            }
//        }
//
//        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
//            if(entry.getValue() == 1) return entry.getKey();
//        }
//
//        return -1;
//    }
}