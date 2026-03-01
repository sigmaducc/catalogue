package com.adnan.striver.binary_search.array_1d;

// Non LeetCode question (but from striver sheet)

public class FloorAndCeilInSortedArray {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public int[] search(int[] nums, int target) {
        int floor = nums[0];
        int ceil = nums[nums.length - 1];

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] <= target) {
                floor = nums[mid];
                low = mid+1;
            }

            if(nums[mid] >= target) {
                ceil = nums[mid];
                high = mid-1;
            }
        }

        return new int[] {floor, ceil};
    }

}