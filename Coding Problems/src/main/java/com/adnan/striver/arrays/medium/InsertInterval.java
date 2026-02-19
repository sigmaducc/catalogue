package com.adnan.striver.arrays.medium;

import java.util.ArrayList;
import java.util.List;

// Leetcode 57: MEDIUM

// Approach: Overlap means whenever the start is before the end of prev interval.
// The solution would become much simpler if we simply sort the array but in this
// case the array is already sorted. We first place the newInterval in the correct
// position. By simply iterating over the new array. which is 1 larger than interval
// array. We keep track of a boolean just to check if we were able to place
// newInterval in the new array. If not that means all the elements in interval are
// bigger than newInterval. So we simply add the interval in the last empty place in
// new array. Similar to previous approaches we keep 2 pointers. One for aux array and
// one for interval array. We then follow the Merge Intervals concept.

// We will store prev reference. Then start iterating from 1. We first check if
// end of prev interval is greater than start of current interval. If it is then
// we simply update the prev interval's end with current interval's end while
// observing the max. If not then we simply add prev to list and update prev
// with current. Finally, we add prev(which is last element of array) to the list.

public class InsertInterval {

    // Time Complexity: O(n+1+n) ~ O(n)
    // Space Complexity: O(2*n + 2*n) ~ O(n)
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0) {
            return new int[][] {{newInterval[0], newInterval[1]}};
        }

        int[][] aux = new int[intervals.length+1][2];
        List<int[]> list = new ArrayList<>();

        int i = intervals.length - 1;
        int j = aux.length - 1;
        boolean filled = false;

        while(i >= 0 && j >= 0) {
            if(intervals[i][0] > newInterval[0]) {
                aux[j] = intervals[i];
                i--;
                j--;
            } else {
                aux[j] = newInterval;
                j--;
                filled = true;
                break;
            }
        }

        while(i >= 0 && j >= 0) {
            aux[j] = intervals[i];
            i--;
            j--;
        }

        if(!filled && j >= 0) {
            aux[j] = newInterval;
        }

        int[] prev = aux[0];
        for(int k = 1; k <= aux.length - 1; k++) {
            int[] current = aux[k];
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
}

    // Some bullshit solution
//    public int[][] insert(int[][] intervals, int[] newInterval) {
//        int[][] aux = new int[intervals.length+1][2];
//        int i = intervals.length - 1;
//        int j = aux.length - 1;
//
//        if(intervals.length == 0) {
//            return new int[][]{{newInterval[0], newInterval[1]}};
//        }
//
//        boolean filled = false;
//
//        while(i >= 0 && j >= 0) {
//            int start = intervals[i][0];
//            int end = intervals[i][1];
//
//            if(start > newInterval[0]) {
//                aux[j][0] = start;
//                aux[j][1] = end;
//                j--;
//                i--;
//            } else {
//                aux[j][0] = newInterval[0];
//                aux[j][1] = newInterval[1];
//                j--;
//                filled = true;
//                break;
//            }
//        }
//
//        while(i >= 0 && j >= 0) {
//            aux[j][0] = intervals[i][0];
//            aux[j][1] = intervals[i][1];
//            j--;
//            i--;
//        }
//
//        if(!filled) {
//            aux[j][0] = newInterval[0];
//            aux[j][1] = newInterval[1];
//        }
//
//        if(aux.length <= 1) return aux;
//
////        System.out.println(Arrays.deepToString(aux));
//
//        List<List<Integer>> list = new ArrayList<>();
//
//        mergeIntervals(list, aux[0][0], aux[0][1], aux[1][0], aux[1][1]);
////        System.out.println(list);
//        for(int k = 2; k <= aux.length - 1; k++) {
//            List<Integer> lastElement = list.getLast();
//            mergeIntervals(list, lastElement.get(0), lastElement.get(1), aux[k][0], aux[k][1]);
////            System.out.println(list);
//        }
//
//        int[][] elements = new int[list.size()][2];
//
//        for(int k = 0; k <= list.size() - 1; k++) {
//            elements[k][0] = list.get(k).get(0);
//            elements[k][1] = list.get(k).get(1);
//        }
//
//        return elements;
//    }
//
//    private void mergeIntervals(List<List<Integer>> list, int start, int end, int nextStart, int nextEnd) {
//        int min = Math.min(Math.min(start, end), Math.min(nextStart, nextEnd));
//        int max = Math.max(Math.max(start, end), Math.max(nextStart, nextEnd));
//
////        System.out.println(min);
////        System.out.println(max);
////        System.out.println(start);
////        System.out.println(end);
////        System.out.println(nextStart);
////        System.out.println(nextEnd);
//        // Non overlapping
//        if(start < nextStart && end < nextStart && end < nextEnd) {
////            System.out.println("double");
//            if(list.isEmpty()) {
//                list.add(List.of(start, end));
//                list.add(List.of(nextStart, nextEnd));
//            } else {
//                list.add(List.of(nextStart, nextEnd));
//            }
//        } else {
////            System.out.println("single");
//            if(!list.isEmpty()) list.removeLast();
//
//            list.add(List.of(min, max));
//        }
//    }