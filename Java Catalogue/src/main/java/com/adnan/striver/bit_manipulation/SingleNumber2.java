package com.adnan.striver.bit_manipulation;

// LeetCode 137: MEDIUM
// https://leetcode.com/problems/single-number-ii/

// Approach: We maintain 2 buckets for checking if three numbers are duplicate.
// We keep adding elements in each bucket but before adding we need to check
// it doesn't belong in the other bucket.
// To do that we xor simply and check that it doesn't belong in other bucket.

public class SingleNumber2 {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int singleNumber(int[] nums) {
        int ones = 0; int twos = 0;

        for(int num: nums) {
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }

        return ones;
    }
}