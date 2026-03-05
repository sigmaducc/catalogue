package com.adnan.striver.strings.medium;

// LeetCode 8: MEDIUM
// https://leetcode.com/problems/string-to-integer-atoi/

// Approach: This is a straightforward question. There are a few steps given.
// 1. Whitespace -> trim() to get rid of whitespace
// 2. Sign -> After spaces there can be only sign. So check for it. 1 for
// positive and -1 for negative. And increment the pointer and go to next char.
// 3. Conversion -> We can parse from 0-9 and ignore all the others. Don't need
// to worry about leading zeroes because they will eventually be dropped when
// converting to integer.
// 4. Rounding -> This is little tricky. We need to keep track of our number at each step.
// If multiplying it by our sign crosses our bounds we return the respective bounds.

public class StringToInteger {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int myAtoi(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;

        int i = 0; long ans = 0;
        int sign = s.charAt(i) == '-' ? -1 : 1;
        if(s.charAt(i) == '-' || s.charAt(i) == '+') i++;

        while(i <= s.length() - 1) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9') break;

            ans = ans * 10 + s.charAt(i) - '0';

            if(sign * ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign * ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;

            i++;
        }

        return (int) (sign * ans);
    }
}