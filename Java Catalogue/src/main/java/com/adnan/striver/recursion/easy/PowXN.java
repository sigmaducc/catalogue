package com.adnan.striver.recursion.easy;

// LeetCode 50: MEDIUM
// https://leetcode.com/problems/powx-n/

// Approach: Using (x^a)^b law of indices to break down powers
// into sub powers. If n is even we simply square x and half n.
// If n is odd we decrement n by 1.

public class PowXN {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
//    public double myPow(double x, int n) {
//        long nn = n;
//
//        if(nn < 0) {
//            x = 1 / x;
//            nn = -nn;
//        }
//
//        double prod = 1;
//        while(nn > 0) {
//            if(nn % 2 == 0) {
//                x = x * x;
//                nn = nn / 2;
//            } else {
//                nn = nn - 1;
//                prod = prod * x;
//            }
//        }
//
//        return prod;
//    }

    // Time Complexity: O(log n)
    // Space Complexity: O(log n) (call stack)
    public double myPow(double x, int nn) {
        long n = nn;
        if(nn < 0) {
            x = 1/x;
            n = -1L * nn;
        }

        if(x == 0) return 0;
        if(n == 0) return 1;

        if(n % 2 == 0) {
            return myPow(x * x, (int) (n / 2));
        }

        return x * myPow(x, (int) (n - 1));
    }
}