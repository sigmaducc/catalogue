package com.adnan.striver.basics.easy;

// Non LeetCode question (but from striver sheet)

public class CheckIfANumberIsPrimeOrNot {

    // Time Complexity: O(sqrt(n))
    // Space Complexity: O(1)
    public boolean isPrime(int n) {
        if(n == 0 || n == 1) return false;

        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0 && n != i) {
                return false;
            }
        }

        return true;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
//    public boolean isPrime(int n) {
//        if(n == 0 || n == 1) return false;
//
//        for(int i = 2; i <= n; i++) {
//            if(n % i == 0 && n != i) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}