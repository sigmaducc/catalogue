package com.adnan.striver.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 232: EASY
// https://leetcode.com/problems/implement-queue-using-stacks/

// Approach: We maintain 2 stack and before writing anything to
// stack 1 we empty the bucket in stack 2 and then put our value
// in stack 1, and we empty the bucket 2 in bucket 1.
// For peek, pop and empty we simply use stack 1.

public class ImplementQueueUsingStacks {

    Deque<Integer> stack1 = new ArrayDeque<>();
    Deque<Integer> stack2 = new ArrayDeque<>();

    // Time Complexity: O(n + 1 + n) ~ O(n)
    public void push(int x) {
        while(!this.stack1.isEmpty()) {
            this.stack2.push(this.stack1.pop());
        }

        this.stack1.push(x);

        while(!this.stack2.isEmpty()) {
            this.stack1.push(this.stack2.pop());
        }
    }

    // Time Complexity: O(1)
    public int pop() {
        return this.stack1.pop();
    }

    // Time Complexity: O(1)
    public int peek() {
        return this.stack1.peek();
    }

    // Time Complexity: O(1)
    public boolean empty() {
        return this.stack1.isEmpty();
    }

}