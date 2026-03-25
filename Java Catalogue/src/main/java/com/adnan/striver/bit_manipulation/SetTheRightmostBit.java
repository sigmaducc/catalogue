package com.adnan.striver.bit_manipulation;

// Non LeetCode question (but from striver sheet)

public class SetTheRightmostBit {

    public int set(int n) {

        return n | (n+1);
    }
}