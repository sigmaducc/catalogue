package com.adnan.striver.bit_manipulation;

// Non LeetCode question (but from striver sheet)

public class SetTheRightmostBit {

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int set(int n) {

        return n | (n+1);
    }
}