package com.adnan.striver.stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 496: EASY
// https://leetcode.com/problems/next-greater-element-i/

// Approach: Calculate the NGE for each element in nums2. In the end
// just map the values. While building the NGE keep building the map.
// Use monotonic stack (lightpole analogy) for removing smaller
// values than current number.

public class NextGreaterElement {

    // Time Complexity: O(nums2 + nums2 + nums1) ~ O(nums1 + nums2)
    // Space Complexity: O(10001 + nums1 + nums2)
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums1.length];
        int[] map = new int[10_000 + 1];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = nums2.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= nums2[i])
                stack.pop();

            if(stack.isEmpty())
                map[nums2[i]] = -1;
            else
                map[nums2[i]] = stack.peek();

            stack.push(nums2[i]);
        }

        int i = 0;
        for(int num: nums1) {
            nge[i++] = map[num];
        }

        return nge;
    }

}