package com.adnan.striver.basics.easy;

// LeetCode 9: (EASY)
// https://leetcode.com/problems/palindrome-number/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        int ans = 0;
        int xCopy = x;

        while(x != 0) {
            int rem = x % 10;
            x = x / 10;

            ans = ans * 10 + rem;
        }

        return xCopy == ans;
    }
}