package com.adnan.striver.arrays.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Leetcode 128: MEDIUM

// Approach 1: It is simple because we simply sort the array and check the number
// of times we get consecutive numbers. Ignoring same numbers of course. When ever we get a
// number bigger than the next consecutive number we reset the counter to 1. At each step we
// maintain a max counter and return it in the end.

// Approach 2: It is a little non-intuitive. We have to use set to get rid of duplicates.
// We then iterate over the set. If we find that an element has a prev consecutive number
// we skip it because it will be handled by the smallest number for that range. When we
// come across a number that has no prev consecutive number we check if the next consecutive
// of that element exists in the set. If it does, we simply increment the counter and go to
// next consecutive number. At each step when next consecutive number exists in the set we
// increment the counter. Here, also we keep a max counter and return it in the end.

// TODO: Approach 3: Instead of using Arrays.sort() try using Radix sort because it works
// best with integers. Should be faster than Arrays.sort()

public class LongestConsecutiveSequence {

    // Time Complexity: O(n * log n)
    // Space Complexity: O(1)
//    public int longestConsecutive(int[] nums) {
//        if(nums.length == 0) return 0;
//
//        Arrays.sort(nums);
//
//        int counter = 1;
//        int maxCounter = 1;
//        for(int i = 0; i <= nums.length - 2; i++) {
//            if(nums[i] == nums[i+1]) continue;
//
//            if(nums[i] + 1 == nums[i+1])
//                counter++;
//            else
//                counter = 1;
//
//            maxCounter = Math.max(counter, maxCounter);
//        }
//
//        return maxCounter;
//    }

    // Time Complexity: O(n * n) or O(n * 1)
    // Depending upon the collisions in set the complexity can vary between O(n) to O(n^2)
    // Space Complexity: O(n)
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i <= nums.length - 1; i++) {
            set.add(nums[i]);
        }

        int maxCounter = 1;
        for(Integer el: set) {
            int counter = 1;
            int prev = el - 1;
            if(!set.contains(prev)) {
                int next = el + 1;
                while(set.contains(next)) {
                    counter++;
                    next++;
                }
            }

            maxCounter = Math.max(counter, maxCounter);
        }

        return maxCounter;
    }
}