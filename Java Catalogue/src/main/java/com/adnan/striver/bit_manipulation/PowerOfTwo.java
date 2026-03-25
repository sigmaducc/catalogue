package com.adnan.striver.bit_manipulation;

// LeetCode 231: EASY
// https://leetcode.com/problems/power-of-two/

public class PowerOfTwo {

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public boolean isPowerOfTwo(int n) {

        return n > 0 && (n & (n-1)) == 0;
    }
}