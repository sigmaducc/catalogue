package com.adnan.striver.stack_queue.prefix_infix_postfix;

import java.util.ArrayDeque;
import java.util.Deque;

public class Postfix {

    // Time Complexity: O(n + n + n) ~ O(n)
    // Space Complexity: O(n)
    public String convertToInfix(String s) {
        s = s.trim().replaceAll(" ", "");

        Deque<String> stack = new ArrayDeque<>();

        for(char c: s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String top1 = stack.pop();
                String top2 = stack.pop();

                stack.push("(" + top2 + c + top1 + ")");
            }
        }

        return stack.peek();
    }

    // Time Complexity: O(n + n + n) ~ O(n)
    // Space Complexity: O(n)
    public String convertToPrefix(String s) {
        s = s.trim().replaceAll(" ", "");

        Deque<String> stack = new ArrayDeque<>();

        for(char c: s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String top1 = stack.pop();
                String top2 = stack.pop();

                stack.push(c + top2 + top1);
            }
        }

        return stack.peek();
    }
}