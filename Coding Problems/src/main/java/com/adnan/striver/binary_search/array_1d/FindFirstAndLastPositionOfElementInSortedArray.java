package com.adnan.striver.binary_search.array_1d;

// LeetCode 34: MEDIUM
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// Approach: Apply 2 pass binary search. First one to find the first occurrence and second
// one to find the last occurrence. Why this works? Because when we go through the first pass,
// and we find an element which matches the target we want to find if there exists and element
// lesser than it. Which is why we move left and forget about right half. Similarly, for second
// pass. We need to find the first occurrence and when we do we want to move right because we want
// to maximize the index. Hence, we ignore the left half. Both passes should give the required indexes.
// If not found we return -1.

public class FindFirstAndLastPositionOfElementInSortedArray {

    // Time Complexity: O(log n + log n) ~ O(log n)
    // Space Complexity: O(1)
    public int[] searchRange(int[] nums, int target) {
        return new int[] {findFirstOccurrence(nums, target), findLastOccurrence(nums, target)};
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int res = -1;
        int low = 0; int high = nums.length - 1;

        while(low <= high) {
            int mid = low+(high-low)/2;

            if(nums[mid] == target) {
                res = mid;
                high = mid-1;
            } else if(nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return res;
    }

    private int findLastOccurrence(int[] nums, int target) {
        int res = -1;
        int low = 0; int high = nums.length - 1;

        while(low <= high) {
            int mid = low+(high-low)/2;

            if(nums[mid] == target) {
                res = mid;
                low = mid+1;
            } else if(nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return res;
    }

    // This solution looks O(log n) but it is actually O(n)
    // Time Complexity: O(log n + log n) ~ O(log n)
    // Space Complexity: O(1)
//    public int[] searchRange(int[] nums, int target) {
//        int[] aux = {Integer.MAX_VALUE, Integer.MIN_VALUE};
//
//        binarySearch(nums, aux, target, 0, nums.length - 1);
//
//        if(aux[0] == Integer.MAX_VALUE) aux[0] = -1;
//        if(aux[1] == Integer.MIN_VALUE) aux[1] = -1;
//
//        return aux;
//    }
//
//    private void binarySearch(int[] nums, int[] aux, int target, int low, int high) {
//        if(low > high) return;
//
//        int mid = low + (high-low)/2;
//
//        if(nums[mid] == target) {
//            aux[0] = Math.min(aux[0], mid);
//            aux[1] = Math.max(aux[1], mid);
//        } else if(nums[mid] < target) {
//            low = mid+1;
//        } else {
//            high = mid-1;
//        }
//
//        binarySearch(nums, aux, target, low, mid-1);
//        binarySearch(nums, aux, target, mid+1, high);
//    }
}