package com.adnan.striver.bit_manipulation;

// Leetcode
// https://leetcode.com/problems/power-of-two/

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        return n > 0 && (n & (n-1)) == 0;
    }
}