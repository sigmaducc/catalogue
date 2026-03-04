package com.adnan.striver.arrays.easy;

// LeetCode 26: EASY
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// Use an auxiliary array and then keep filling it everytime you
// encounter a number which is different from it's predecessor
// Finally return the size of that array based on the k counter.
// Don't forget to modify the original array.

public class RemoveDuplicatesFromSortedArray {

    // Time complexity: O(n)
    // Space Complexity: O(n)
    public int removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];

        int k = 0;
        arr[k++] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] < nums[i])
                arr[k++] = nums[i];
        }

        for(int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        return k;
    }
}