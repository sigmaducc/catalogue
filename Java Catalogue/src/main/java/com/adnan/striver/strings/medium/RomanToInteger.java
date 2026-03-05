package com.adnan.striver.strings.medium;

// LeetCode 13: EASY
// https://leetcode.com/problems/roman-to-integer/

// Approach: Most of the conditions is given in question. Simply follow it.
// One thing to note is start with last element as sum. So, you can start
// from n-2 easily. Without +1 issues.
// We almost always add but in few cases we subtract. Also, avoid map to
// keep your solution fast. Simply use a switch statement.

public class RomanToInteger {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int romanToInt(String s) {
        int sum = roman2Int(s.charAt(s.length() - 1));
        for(int i = s.length() - 2; i >= 0; i--) {
            char nextC = s.charAt(i+1);
            char c = s.charAt(i);

            if((c == 'I' && (nextC == 'V' || nextC == 'X'))
                || (c == 'X' && (nextC == 'L' || nextC == 'C'))
                || (c == 'C' && (nextC == 'D' || nextC == 'M'))
            ) {
                sum -= roman2Int(c);
            } else {
                sum += roman2Int(c);
            }
        }

        return sum;
    }

    private int roman2Int(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}