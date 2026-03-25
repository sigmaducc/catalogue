package com.adnan.striver.bit_manipulation;

import java.util.ArrayList;
import java.util.List;

// LeetCode 78: MEDIUM
// https://leetcode.com/problems/subsets/

// Approach: Last time we used recursion for solving this problem
// but this one looks way simpler. We simply check set bits for
// each position of nums if it is set we add to the list.
//          123
// 0        000
// 1        001
// 2        010
// 3        011
// 4        100
// 5        101
// 6        110
// 7        111

public class Subsets {

    // Time Complexity: O(n * 2^n)
    // Space Complexity: O(n * 2^n) or O(n)
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int n = 1 << nums.length;

        for(int i = 0; i <= n - 1; i++) {
            List<Integer> l = new ArrayList<>();

            for(int j = 0; j <= nums.length - 1; j++) {
                if((i & (1 << j)) != 0)
                    l.add(nums[j]);
            }

            list.add(l);
        }

        return list;
    }
}