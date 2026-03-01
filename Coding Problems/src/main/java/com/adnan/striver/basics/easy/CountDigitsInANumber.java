package com.adnan.striver.basics.easy;

// Non LeetCode question (but from striver sheet)

public class CountDigitsInANumber {

    // Time Complexity: O(log10(n) + 1)
    // Space Complexity: O(1)
//    public int countDigits(int n) {
//        int counter = 1;
//
//        while(n/10 != 0) {
//            n = n/10;
//            counter++;
//        }
//
//        return counter;
//    }


    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int countDigits(int n) {
        return (int) (Math.log10(n) + 1.0d);
    }
}