package com.adnan.interviews.jpmorgan.oa;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

// JPMorgan Chase Cohort HackerRank question 2

public class ReduceArray {

    // Time Complexity: O(n * log n + n) ~ O(n * log n)
    // Space Complexity: O(n)
    public int totalCost(List<Integer> arr) {
        double[] nums = new double[arr.size()];

        for(int i = 0; i <= arr.size() - 1; i++) {
            nums[i] = arr.get(i);
        }

        Arrays.sort(nums);
        double totalCost = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            double max = nums[nums.length - 1];
            double min = nums[i];

            double sum = min + max;
            double cost = Math.ceil(sum / (max - min + 1));
            nums[nums.length - 1] = sum;

            totalCost += cost;
        }

        return (int) totalCost;
    }

    // Time Complexity: O(n * log n)
    // Space Complexity: O(n)
//    public int totalCost(List<Integer> arr) {
//        TreeMap<Long, Integer> map = new TreeMap<>();
//
//        // Build frequency map
//        for (int num : arr) {
//            long val = num;
//            map.put(val, map.getOrDefault(val, 0) + 1);
//        }
//
//        long totalCost = 0;
//        int operations = arr.size() - 1;
//
//        while (operations-- > 0) {
//
//            long min = map.firstKey();
//            long max = map.lastKey();
//
//            // remove min
//            if (map.get(min) == 1) {
//                map.remove(min);
//            } else {
//                map.put(min, map.get(min) - 1);
//            }
//
//            // remove max
//            if (map.get(max) == 1) {
//                map.remove(max);
//            } else {
//                map.put(max, map.get(max) - 1);
//            }
//
//            long sum = min + max;
//
//            long denominator = max - min + 1;
//            long cost = (sum + denominator - 1) / denominator; // ceil
//
//            totalCost += cost;
//
//            // add sum back
//            map.put(sum, map.getOrDefault(sum, 0) + 1);
//        }
//
//        return (int) totalCost;
//    }
}