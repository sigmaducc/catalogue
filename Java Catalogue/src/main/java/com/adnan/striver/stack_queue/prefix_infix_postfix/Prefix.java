package com.adnan.striver.stack_queue.prefix_infix_postfix;

import java.util.ArrayDeque;
import java.util.Deque;

public class Prefix {

    // Time Complexity: O(n + n + n) ~ O(n)
    // Space Complexity: O(n)
    public String convertToInfix(String s) {
        s = s.trim().replaceAll(" ", "");

        Deque<String> stack = new ArrayDeque<>();

        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String top1 = stack.pop();
                String top2 = stack.pop();

                stack.push("(" + top1 + c + top2 + ")");
            }
        }

        return stack.peek();
    }

    // Time Complexity: O(n + n + n) ~ O(n)
    // Space Complexity: O(n)
    public String convertToPostfix(String s) {
        s = s.trim().replaceAll(" ", "");

        Deque<String> stack = new ArrayDeque<>();

        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String top1 = stack.pop();
                String top2 = stack.pop();

                stack.push(top1 + top2 + c);
            }
        }

        return stack.peek();
    }

}