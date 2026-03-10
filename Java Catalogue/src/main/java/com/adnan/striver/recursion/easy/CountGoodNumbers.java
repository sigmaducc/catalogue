package com.adnan.striver.recursion.easy;

// LeetCode 1922: MEDIUM
// https://leetcode.com/problems/count-good-numbers/

// Approach: The question is confusing a bit but once you understand
// it, it becomes simpler. It is basically combinatorics problem.
// If we have n places, and few rules how big of a number can we make.
// Here that number is count of digit string's.
// Note: modding is the most confusing part of this problem.

public class CountGoodNumbers {
    private final long MOD = 1_000_000_007;

    // Time Complexity: O(log n/2 + log n/2) ~ O(log n)
    // Space Complexity: O(log n) or O(1) if we use iterative pow()
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long e = pow(5, even);
        long o = pow(4, odd);

        return (int) ((e * o) % MOD);
    }

    private long pow(long x, long n) {
        x = x % MOD;
        if(x == 0) return 0;
        if(n == 0) return 1;

        if(n % 2 == 0) {
            return pow((x * x) % MOD, n / 2) % MOD;
        }

        return (x * pow(x, n - 1)) % MOD;
    }
}