package com.adnan.striver.bit_manipulation;

// Non LeetCode question (but from striver sheet)

public class CountTheNumberOfSetBits {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public int count(int n) {
        int counter = 0;

        while(n != 0) {
            counter += n & 1;
            n = n >> 1;
        }

        return counter;
    }
}