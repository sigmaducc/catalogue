package com.adnan.striver.arrays.medium;

import java.util.HashMap;
import java.util.Map;

// Leetcode 1: EASY

// Approach: We iterate over the array and store the number at each step with its index. While
// we do this we also check for the diff which is nothing but (target - b) which will give a.
// At each step we check diff meaning if that number has been seen before. If we did we simply
// return current index and stored index.
// Since this is two sum we can do it in O(n) instead of O(n^2)

public class TwoSum {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{i, map.get(diff)};
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }

//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < nums.length; i++) {
//            int diff = target - nums[i];
//
//            if(map.containsKey(diff)) {
//                return new int[] {i, map.get(diff)};
//            }
//
//            map.put(nums[i], i);
//        }
//
//        return new int[] {};
//    }
}