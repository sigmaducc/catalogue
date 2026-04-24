package com.adnan.striver.heaps;

import java.util.PriorityQueue;

// LeetCode 295: HARD
// https://leetcode.com/problems/find-median-from-data-stream/

// Approach: We simply divide the whole data stream into 2 halves which is left half
// and right half from the middle aka median. Left half will be sorted values which
// can be simulated using max heap and right half is also sorted and can be simulated
// using min heap.

// Time Complexity: O(N log N) for N data points
public class FindMedianFromDataStream {
    // Space Complexity: O(N)
    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    public FindMedianFromDataStream() {
        this.maxHeap = new PriorityQueue<>((a, b) -> b - a);
        this.minHeap = new PriorityQueue<>();
    }

    // Time Complexity: O(7 * log N/2) ~ O(log N/2)
    public void addNum(int num) {
        this.maxHeap.add(num);

        if(!this.maxHeap.isEmpty()
            && !this.minHeap.isEmpty()
            && (this.maxHeap.peek() > this.minHeap.peek())
        ) {
            this.minHeap.add(this.maxHeap.poll());
        }

        if(this.maxHeap.size() > this.minHeap.size() + 1)
            this.minHeap.add(this.maxHeap.poll());

        if(this.minHeap.size() > this.maxHeap.size() + 1)
            this.maxHeap.add(this.minHeap.poll());
    }

    // Time Complexity: O(2 * log N/2) ~ O(log N/2)
    public double findMedian() {
        if(this.maxHeap.isEmpty() && this.minHeap.isEmpty())
            return 0;

        if(this.maxHeap.size() > this.minHeap.size())
            return this.maxHeap.peek();

        if(this.minHeap.size() > this.maxHeap.size())
            return this.minHeap.peek();

        return (this.maxHeap.peek() + this.minHeap.peek()) / 2.0;
    }
}