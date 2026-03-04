package com.adnan.striver.binary_search.array_1d;

// LeetCode 35: EASY
// https://leetcode.com/problems/search-insert-position/

// Approach: Apply simple binary search, if the target is found return index
// if not that means the target is not present in that case return low.
// Why low? Because low represents the lowest index where the target could be
// if it were to exist.

public class SearchInsertPosition {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return low;
    }
}