package com.adnan.striver.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 225: EASY
// https://leetcode.com/problems/implement-stack-using-queues/

// Approach: We use array deque which supports both single and
// double ended queue. We use only single ended queue operations.
// Only need to care about push operation.

public class ImplementStackUsingQueues {

    Deque<Integer> queue = new ArrayDeque<>();

    // Time Complexity: O(n)
    public void push(int x) {
        queue.push(x);

        for(int i = 0; i < queue.size() - 1; i++) {
            queue.push(queue.removeFirst());
        }
    }

    // Time Complexity: O(1)
    public int top() {
        return this.queue.getFirst();
    }

    // Time Complexity: O(1)
    public int pop() {
        return this.queue.removeFirst();
    }

    // Time Complexity: O(1)
    public int size() {
        return this.queue.size();
    }

    // Time Complexity: O(1)
    public boolean empty() {
        return this.queue.isEmpty();
    }

}