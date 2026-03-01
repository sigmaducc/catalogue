package com.adnan.striver.binary_search.array_1d;

// LeetCode 33: MEDIUM
// https://leetcode.com/problems/search-in-rotated-sorted-array/

// Approach: Simple approach, find a pivot (point at which the array stops being sorted)
// Then do 2 binary searches up until that pivot and then from that pivot to the last element.
// Either the element will exist in first part or second part we just need to return max of the
// index.
// How to find pivot is quite interesting. We compare the mid-element with the last element.
// If it is smaller that means we are in the sorted part, and we need to move left because
// pivot lies on the left part. Or we can say that when mid-element is larger than or equal to the last
// element it means we are on the other sorted array so we need to move right.

public class SearchInRotatedSortedArray {

    // Time Complexity: O(log n + log n + log n) ~ O(log n)
    // Space Complexity: O(1)
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        int a = binarySearch(nums, target, 0, pivot-1);
        int b = binarySearch(nums, target, pivot, nums.length - 1);

        return Math.max(a, b);
    }

    private int findPivot(int[] nums) {
        int pivot = -1;
        int lastEl = nums[nums.length - 1];
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low+(high-low)/2;

            if(nums[mid] > lastEl) {
                low = mid+1;
            } else {
                high = mid-1;
                pivot = mid;
            }
        }

        return pivot;
    }

    private int binarySearch(int[] nums, int target, int low, int high) {
        int idx = -1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) {
                idx = mid;
                low = mid+1;
                high = mid-1;
            } else if(nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return idx;
    }
}