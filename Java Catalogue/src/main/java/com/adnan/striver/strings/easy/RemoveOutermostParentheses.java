package com.adnan.striver.strings.easy;

// LeetCode 1021: EASY
// https://leetcode.com/problems/remove-outermost-parentheses/

// Approach: Usually we write code to first check for opening parenthesis and closing parenthesis.
// But here we inverse it because we don't want to count outer parenthesis. Because if we count
// outer parenthesis it will make our counter non-zero, and we would end up adding it in result.

public class RemoveOutermostParentheses {

    // Time Complexity: O(n)
    // Space Complexity: O(1) or O(n)
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int counter = 0;

        for(char c: s.toCharArray()) {
            if(c == ')') counter--;
            if(counter != 0) result.append(c);
            if(c == '(') counter++;
        }

        return result.toString();
    }
}