package com.adnan.striver.binary_search.array_1d;

// Non LeetCode question (but from striver sheet)

public class LowerBound {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public int search(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;
            if(nums[mid] >= target) {
                min = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return min;
    }
}