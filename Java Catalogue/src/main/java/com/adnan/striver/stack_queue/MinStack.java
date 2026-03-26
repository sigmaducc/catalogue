package com.adnan.striver.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 155: MEDIUM
// https://leetcode.com/problems/min-stack/

// Approach 1: Maintain two stacks. One for keeping track off all the pushes.
// Another for min values. When popping check if it is the same value pop
// from min stack too else just from main stack.

// Approach 2: Another approach is to maintain min value with each value in stack.
// So we simply return first el for top and second el for getMin()
// Only need to make sure we don't make any mistakes while pushing values in the
// stack. We store value and min both in a primitive array.

public class MinStack {

    // Space Complexity: O(n)
    Deque<int[]> stack = new ArrayDeque<>();

    // Time Complexity: O(1)
    public void push(int val) {
        int min = stack.isEmpty() ? val : Math.min(val, stack.peek()[1]);
        stack.push(new int[] {val, min});
    }

    // Time Complexity: O(1)
    public void pop() {
        stack.pop();
    }

    // Time Complexity: O(1)
    public int top() {
        return stack.peek()[0];
    }

    // Time Complexity: O(1)
    public int getMin() {
        return stack.peek()[1];
    }
}