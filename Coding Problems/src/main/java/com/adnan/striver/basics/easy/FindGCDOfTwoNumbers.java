package com.adnan.striver.basics.easy;

// Non leetcode question (but from striver sheet)

public class FindGCDOfTwoNumbers {

    // Time Complexity: O(min(n1, n2))
    // Space Complexity: O(1)
//    public int gcd(int n1, int n2) {
//        for(int i = Math.min(n1, n2); i > 0; i--) {
//            if(n1 % i == 0 && n2 % i == 0) {
//                return i;
//            }
//        }
//
//        return 1;
//    }

    // Time Complexity: O(min(n1, n2))
    // Space Complexity: O(1)
//    public int gcd(int n1, int n2) {
//        int maxGcd = 1;
//        for(int i = 1; i <= Math.min(n1, n2); i++) {
//            if(n1 % i == 0 && n2 % i == 0) {
//                maxGcd = Math.max(maxGcd, i);
//            }
//        }
//
//        return maxGcd;
//    }

    // Time Complexity: O(min(n1, n2))
    // Space Complexity: O(1)
    public int gcd(int n1, int n2) {
        if(n1 == 0) return n2;

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);

        return gcd(max - min, min);
    }
}