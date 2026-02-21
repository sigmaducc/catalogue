package com.adnan.striver.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode 56: MEDIUM

// Approach: Overlap means whenever the start is before the end of prev interval.
// The solution would become much simpler if we simply sort the array.
// We will store prev reference. Then start iterating from 1. We first check if
// end of prev interval is greater than start of current interval. If it is then
// we simply update the prev interval's end with current interval's end while
// observing the max. If not then we simply add prev to list and update prev
// with current. Finally, we add prev(which is last element of array) to the list.

public class MergeIntervals {

    // Time Complexity: O(n log n + n + n) ~ O(n * logn)
    // Space Complexity: O(2*n + 2*n) ~ O(n)
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();

        int[] prev = intervals[0];
        for(int i = 1; i <= intervals.length - 1; i++) {
            int[] current = intervals[i];
            if(prev[1] >= current[0]) {
                prev[1] = Math.max(current[1], prev[1]);
            } else {
                list.add(prev);
                prev = current;
            }
        }

        list.add(prev);

        return list.toArray(new int[list.size()][2]);
    }

    // Some bullshit solution which ate up my 2-3 hours
//    public int[][] merge(int[][] intervals) {
//        if(intervals.length <= 1) return intervals;
//
//        List<List<Integer>> list = new ArrayList<>();
//
//        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//
//        mergeInterval(list, intervals[0][0], intervals[0][1], intervals[1][0], intervals[1][1]);
//        for(int i = 2; i <= intervals.length - 1; i++) {
//            List<Integer> lastElement = list.getLast();
//            mergeInterval(list, lastElement.get(0), lastElement.get(1), intervals[i][0], intervals[i][1]);
//        }
//
//        int[][] elements = new int[list.size()][2];
//        for(int i = 0; i <= list.size() - 1; i++) {
//            int start = list.get(i).get(0);
//            int end = list.get(i).get(1);
//
//            elements[i][0] = start;
//            elements[i][1] = end;
//        }
//
//        return elements;
//    }
//
//    private void mergeInterval(List<List<Integer>> list, int start, int end, int nextStart, int nextEnd) {
//        int min = Math.min(Math.min(start, end), Math.min(nextStart, nextEnd));
//        int max = Math.max(Math.max(start, end), Math.max(nextStart, nextEnd));
//
//        // Non-Overlapping
//        if(start < nextStart && end < nextStart && nextEnd > end) {
//            if(list.isEmpty()) {
//                list.add(List.of(start, end));
//                list.add(List.of(nextStart, nextEnd));
//            } else {
//                list.add(List.of(nextStart, nextEnd));
//            }
//        } else {
//            if(!list.isEmpty())
//                list.removeLast();
//
//            list.add(List.of(min, max));
//        }
//    }
}