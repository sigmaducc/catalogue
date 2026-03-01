package com.adnan.striver.binary_search.array_1d;

// LeetCode 81: MEDIUM
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

// Approach: The pivot concept will not work in this problem because there can be
// duplicates so we will not be able to find the correct position of pivot.
// We need to handle a few edge cases in this one. First is that same elements
// can start the array and end it. Eg: [2,2,2,2,1,2,2,2,2,2]
// In such cases when we encounter same element on low, mid and high we simply
// move our pointers to next/prev element.
// Then we check if the first array is sorted, if it is then we check if target lies in the range.
// If the target lies in that range we forget about right half. If it doesn't we forget about left half.
// Similarly, we check if right array is sorted, if it is then we check if target lies in the range.
// If the target lies in that range we forget about the left half. If it doesn't we forget about the right half.

public class SearchInRotatedSortedArray2 {

    // Time Complexity: O(log n) or worst case O(n) when all elements are repeated
    // Space Complexity: O(1)
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) return true;

            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }

            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target <= nums[mid]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            } else {
                if(nums[mid] <= target && target <= nums[high]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
        }

        return false;
    }
}