package com.adnan.leetcode.daily_coding_challenge._2026.may;

public class FindMinimumInRotatedSortedArray2_16May2026 {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] > nums[high]) {
                low = mid + 1;
            } else if(nums[mid] < nums[high]) {
                high = mid;
            } else {
                high--;
            }
        }

        return nums[low];
    }
}