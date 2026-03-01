package com.adnan.striver.binary_search.array_1d;

// LeetCode 153: MEDIUM
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

// Approach: It is similar to search in rotated sorted array 1. But here instead
// of finding an element we simply find a pivot. That pivot will be the minimum
// in the rotated sorted array. We compare the mid-element with the last element
// if it is smaller than or equal to that means the array is sorted so we discard
// this one and move left while storing the pivot.

public class FindMinimumInRotatedSortedArray {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public int findMin(int[] nums) {
        int pivot = -1;
        int lastEl = nums[nums.length - 1];
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] <= lastEl) {
                pivot = nums[mid];
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return pivot;
    }
}