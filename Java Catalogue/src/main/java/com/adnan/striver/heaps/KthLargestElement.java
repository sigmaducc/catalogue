package com.adnan.striver.heaps;

import java.util.PriorityQueue;

// LeetCode 703: EASY
// https://leetcode.com/problems/kth-largest-element-in-a-stream/

// Approach: We simply use a heap and keep adding elements until we reach
// K elements then we start removing elements since the size has exceeded.
// Since, it is a min heap that means it will remove small elements and store
// large elements. Indirectly, it will store all the high scores, but we need
// K'th element only but that is just the first element of the heap since our
// heap is of size K, and it is a min heap.

public class KthLargestElement {
    private final int k;
    // Space Complexity: O(K)
    private final PriorityQueue<Integer> heap;

    public KthLargestElement(int k, int[] nums) {
        this.k = k;
        this.heap = new PriorityQueue<>();

        for(int num: nums) {
            this.add(num);
        }
    }

    // Time Complexity: O(2 * log K) ~ O(log K)
    public int add(int num) {
        this.heap.add(num);

        if(heap.size() > this.k) {
            heap.poll();
        }

        if(heap.isEmpty())
            return 0;

        return heap.peek();
    }
}