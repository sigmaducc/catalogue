package com.adnan.leetcode.daily_coding_challenge._2026.may;

public class FindMinimumInRotatedSortedArray_15May2026 {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int last = nums[high];

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] <= last) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return nums[low];
    }
}