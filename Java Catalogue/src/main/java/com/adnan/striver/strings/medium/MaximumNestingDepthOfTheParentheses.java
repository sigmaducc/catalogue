package com.adnan.striver.strings.medium;

// LeetCode 1614: EASY
// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

// Approach: For each opening parenthesis we increment counter, for each
// closing parenthesis we decrement counter. At each step we maintain a max
// and simply return it in the end.

public class MaximumNestingDepthOfTheParentheses {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int maxDepth(String s) {
        int max = 0;
        int counter = 0;
        for(char c: s.toCharArray()) {
            if(c == '(') counter++;
            if(c == ')') counter--;

            max = Math.max(counter, max);
        }

        return max;
    }
}