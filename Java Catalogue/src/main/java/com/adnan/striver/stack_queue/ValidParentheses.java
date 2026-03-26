package com.adnan.striver.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 20: EASY
// https://leetcode.com/problems/valid-parentheses/

// Approach: When we encounter opening brackets we put them in
// the stack. As soon as we find a closing bracket we need to
// check it against the proper pair bracket. If it doesn't match
// we will return false.

public class ValidParentheses {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c: s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;

                char p = stack.pop();
                if(p == '(' && c != ')') return false;
                if(p == '[' && c != ']') return false;
                if(p == '{' && c != '}') return false;
            }
        }

        return stack.isEmpty();
    }
}