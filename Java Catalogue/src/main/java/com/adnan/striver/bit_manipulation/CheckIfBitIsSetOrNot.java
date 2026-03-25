package com.adnan.striver.bit_manipulation;

// Non LeetCode question (but from striver sheet)

public class CheckIfBitIsSetOrNot {

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public boolean check(int n, int i) {

        return (n & (1 << i)) != 0;
    }
}