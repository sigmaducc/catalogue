package com.adnan.striver.bit_manipulation;

// LeetCode 2220: EASY
// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/

// Approach: Loop from LSB and keep checking if bits don't match, if
// they don't then toggle the bit in start and incr flip. We need to
// do this while our start and goal is not same. Don't forget to incr i;

public class MinimumBitFlipsToConvertNumber {

    // Time Complexity: O(32) ~ O(1)
    // Space Complexity: O(1)
    public int minBitFlips(int start, int goal) {
        int i = 0; int flip = 0;
        while(start != goal) {
            if((start & (1 << i)) != (goal & (1 << i))) {
                start = start ^ (1 << i);
                flip++;
            }

            i++;
        }

        return flip;
    }
}