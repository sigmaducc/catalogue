package com.adnan.striver.heaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// LeetCode 347: MEDIUM
// https://leetcode.com/problems/top-k-frequent-elements/

// Approach: We maintain a freq map, and then we iterate over all the keys
// While adding to the heap we check the freq of the element meaning it is
// a min heap but in terms of frequency. We keep adding to heap until it
// becomes of size K then we start removing. In the end we will have most
// frequent elements in the heap, and we can return it by turning it into a list.

public class TopKFrequentElements {

    // Time Complexity: O(N + N * log K + K) ~ O(N log K)
    // Space Complexity: O(N + 2 * K) ~ O(N + K)
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int key: map.keySet()) {
            minHeap.add(key);

            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int i = 0;
        int[] result = new int[k];
        while(!minHeap.isEmpty()) {
            result[i++] = minHeap.poll();
        }

        return result;
    }
}