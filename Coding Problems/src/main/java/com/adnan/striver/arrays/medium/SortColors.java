package com.adnan.striver.arrays.medium;

// LeetCode 75: MEDIUM
// https://leetcode.com/problems/sort-colors/

// Simple sort question. It was mentioned to sort it in-place without using
// any sort library so went with quick-sort instead of merge sort.

public class SortColors {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private int findPartition(int[] nums, int low, int high) {
        int i = low;
        int j = high;

        while(i < j) {
            while(nums[i] <= nums[low] && i < high) i++;
            while(nums[low] < nums[j] && j > low) j--;

            if(i < j) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }

    private void quickSort(int nums[], int low, int high) {
        if(low >= high) return;

        int partitionIndex = findPartition(nums, low, high);

        quickSort(nums, low, partitionIndex-1);
        quickSort(nums, partitionIndex+1, high);
    }
}