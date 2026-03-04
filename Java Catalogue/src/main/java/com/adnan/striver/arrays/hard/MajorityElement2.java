package com.adnan.striver.arrays.hard;

import java.util.*;

// LeetCode 229: MEDIUM

// Approach: We use Boyer-Moore Voting algorithm, but instead we have 3 contenders.
// In 2 contenders we canceled each other by incrementing if we find same family
// else we decrement. Here, we need to keep 2 candidates because we have 3 contenders.
// When we encounter same candidate we increment it if not then we decrement both candidates.
// Meaning for each element which is not of candidate family we kill 1 from both family.
// Once we have both candidates we can count their occurance and simply compare if they occur n/3 times.

public class MajorityElement2 {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int count1 = 0; int count2 = 0;
        int candidate1 = 0; int candidate2 = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            if(count1 == 0 && candidate2 != nums[i]) {
                count1 = 1;
                candidate1 = nums[i];
            } else if(candidate1 == nums[i]) {
                count1++;
            } else if(count2 == 0 && candidate1 != nums[i]) {
                count2 = 1;
                candidate2 = nums[i];
            } else if(candidate2 == nums[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0; count2 = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            if(candidate1 == nums[i]) {
                count1++;
            } else if(candidate2 == nums[i]) {
                count2++;
            }
        }

        int oneThird = nums.length/3;

        if(count1 > oneThird) list.add(candidate1);
        if(count2 > oneThird) list.add(candidate2);

        return list;
    }


    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(n)
//    public List<Integer> majorityElement(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//
//        int oneThird = nums.length/3;
//
//        for(int i = 0; i <= nums.length - 1; i++) {
//            if(map.containsKey(nums[i]))
//                map.put(nums[i], map.get(nums[i]) + 1);
//            else
//                map.put(nums[i], 1);
//        }
//
//        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
//            if(entry.getValue() > oneThird) {
//                list.add(entry.getKey());
//            }
//        }
//
//        return list;
//    }


    // Time Complexity: O(n * log n + n) ~ O(n logn)
    // Space Complexity: O(n)
//    public List<Integer> majorityElement(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//
//        if(nums.length < 2) {
//            for(int i = 0; i <= nums.length - 1; i++) {
//                list.add(nums[i]);
//            }
//
//            return list;
//        }
//
//        if(nums.length == 2) {
//            list.add(nums[0]);
//            if(nums[0] != nums[1])
//                list.add(nums[1]);
//
//            return list;
//        }
//
//        int oneThird = nums.length/3;
//
//        Arrays.sort(nums);
//
//        int counter = 1;
//        boolean added = false;
//        for(int i = 1; i <= nums.length - 1; i++) {
//            if(nums[i-1] == nums[i]) {
//                counter++;
//            } else if(nums[i-1] < nums[i]) {
//                counter = 1;
//                added = false;
//            }
//
//            if(counter > oneThird && !added) {
//                list.add(nums[i]);
//                added = true;
//            }
//        }
//
//        return list;
//    }
}