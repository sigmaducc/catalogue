package com.adnan.striver.bit_manipulation;

// LeetCode 3158: EASY
// https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/

// Approach: We simply use the bruteforce approach. If the elements are same we xor.

public class FindTheXorOfNumbersWhichAppearTwice {

    // Time Complexity: O(n * n) ~ O(n ^ 2)
    // Space Complexity: O(1)
    public int duplicateNumbersXOR(int[] nums) {
        int xor = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            for(int j = i+1; j <= nums.length - 1; j++) {
                if(nums[i] == nums[j])
                    xor ^= nums[j];
            }
        }

        return xor;
    }
}