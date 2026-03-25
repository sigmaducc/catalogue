package com.adnan.striver.bit_manipulation;

// Non LeetCode question (but from striver sheet)

public class CountTheNumberOfSetBits {

    public int count(int n) {
        int counter = 0;

        while(n != 0) {
            counter += n & 1;
            n = n >> 1;
        }

        return counter;
    }
}