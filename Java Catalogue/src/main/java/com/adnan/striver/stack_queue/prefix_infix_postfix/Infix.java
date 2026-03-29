package com.adnan.striver.stack_queue.prefix_infix_postfix;

import java.util.ArrayDeque;
import java.util.Deque;

// NOTE: if current char is equal to top char we pop meaning we evaluate
// but in case of ^ we wait for last ^ so we have a != in postfix but in
// prefix we need to evaluate ^ immediately.

public class Infix {

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(n + n) ~ O(n)
    public String convertToPostfix(String s) {
        s = s.trim();
        s = s.replaceAll(" ", "");
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder output = new StringBuilder();

        for(char c: s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                output.append(c);
            } else if(c == '(') {
                stack.push('(');
            } else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }

                stack.pop();
            } else {
                while(!stack.isEmpty()
                        && (priority(c) < priority(stack.peek())
                            || (priority(c) == priority(stack.peek()) && c != '^')
                        )
                ) {
                    output.append(stack.pop());
                }

                stack.push(c);
            }
        }

        while(!stack.isEmpty())
            output.append(stack.pop());

        return output.toString();
    }

    // Time Complexity: O(n + n + n + n + n) ~ O(5n) ~ O(n)
    // Space Complexity: O(n + n + n) ~ O(n)
    public String convertToPrefix(String s) {
        s = s.trim();
        s = s.replaceAll(" ", "");

        StringBuilder str = new StringBuilder(s);

        str.reverse();

        int i = 0;
        while(i <= str.length() - 1) {
            if(str.charAt(i) == '(')
                str.setCharAt(i, ')');
            else if(str.charAt(i) == ')') {
                str.setCharAt(i, '(');
            }

            i++;
        }

        StringBuilder output = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();
        for(char c: str.toString().toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                output.append(c);
            } else if(c == '(') {
                stack.push('(');
            } else if(c == ')') {
                while(!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }

                stack.pop();
            } else {
                while(!stack.isEmpty()
                        && (priority(c) < priority(stack.peek())
                            || (priority(c) == priority(stack.peek()) && c == '^')
                        )
                ) {
                    output.append(stack.pop());
                }

                stack.push(c);
            }
        }

        while(!stack.isEmpty())
            output.append(stack.pop());

        output.reverse();

        return output.toString();
    }

    private int priority(char c) {
        if(c == '(') return 0;
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 2;
        if(c == '^') return 3;

        return -1;
    }

}