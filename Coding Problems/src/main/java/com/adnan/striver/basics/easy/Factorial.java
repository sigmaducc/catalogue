package com.adnan.striver.basics.easy;

// Non leetcode question (but from striver sheet)

public class Factorial {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public long factorial(int n) {
        long fact = n;

        while(--n > 0) {
            System.out.println(fact);
            fact *= n;
        }

        return fact;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) - Stack calls
//    public long factorial(int n) {
//        if(n == 0) return 1;
//
//        return n * factorial(n - 1);
//    }
}