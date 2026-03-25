package com.adnan.striver.bit_manipulation;

// Non LeetCode question (but from striver sheet)

public class CheckIfBitIsSetOrNot {

    public boolean check(int n, int i) {

        return (n & (1 << i)) != 0;
    }
}