package com.adnan.striver.bit_manipulation;

// Non LeetCode question (but from striver sheet)

public class CheckIfANumberIsOddOrNot {

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public boolean check(int n) {

        return (n & 1) != 0;
    }
}