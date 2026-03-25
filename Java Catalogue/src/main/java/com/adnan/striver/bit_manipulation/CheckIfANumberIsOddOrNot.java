package com.adnan.striver.bit_manipulation;

// Non LeetCode question (but from striver sheet)

public class CheckIfANumberIsOddOrNot {

    public boolean check(int n) {

        return (n & 1) != 0;
    }
}