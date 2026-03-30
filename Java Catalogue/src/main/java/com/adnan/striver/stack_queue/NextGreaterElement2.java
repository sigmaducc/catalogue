package com.adnan.striver.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 503: MEDIUM
// https://leetcode.com/problems/next-greater-element-ii/

// Approach: Exactly like first problem except only 1 extra iteration needed.

public class NextGreaterElement2 {

    // Time Complexity: O(n + n + n + n) ~ O(n)
    // Space Complexity: O(n + n) ~ O(n)
    public int[] nextGreaterElements(int[] nums) {
        int[] map = new int[nums.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = nums.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            if(stack.isEmpty())
                map[i] = Integer.MIN_VALUE;
            else
                map[i] = stack.peek();

            stack.push(nums[i]);
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            if(map[i] == Integer.MIN_VALUE) {
                while(!stack.isEmpty() && stack.peek() <= nums[i]) {
                    stack.pop();
                }

                if(stack.isEmpty())
                    map[i] = -1;
                else
                    map[i] = stack.peek();
            }
        }

        return map;
    }
}