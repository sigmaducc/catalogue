package com.adnan.striver.strings.easy;

// LeetCode 796: EASY
// https://leetcode.com/problems/rotate-string/

// Approach: If we use all the built-in string functions it is simply a one-liner.
// Main thing here is to implement contains method. Also, keep note that when doing
// s+s we can forget about rotation. And it simply becomes a substring problem.
// Contains() is a simple algorithm. We check if string of length m belongs in
// string of length n. This problem is solveable easily if you do a dry run.
// string: defdefdefabcabcdefdefdefabcabc
// substring: defdefabcabcdef
// So our n becomes 30 and m becomes 15.
// We start from 0 to 15 of n then check each character from m. If at a point we
// find that our j counter is equal to m that means we have found the substring.

public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        return contains(s+s, goal);
    }

    private boolean contains(String target, String pattern) {
        int n = target.length();
        int m = pattern.length();

        for(int i = 0; i <= n-m; i++) {
            int j = 0;
            while(j <= m-1 && target.charAt(i + j) == pattern.charAt(j)) j++;

            if(j == m) return true;
        }

        return false;
    }
}