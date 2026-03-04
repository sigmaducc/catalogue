package com.adnan.striver.arrays.easy;

// LeetCode 283: EASY
// https://leetcode.com/problems/move-zeroes/description/

// Approach: The intuition is to keep track of zero position.
// Then iterate over the array. Find the first element that is non-zero.
// place it j position and increment j.
// Possibilities: i & j both can be non-zero so they just do nums[i] = nums[j]
// Meaning reading and writing at same index. But when keep moving i then j
// gets stuck with zero. We simply overwrite that zero with nums[i]. Once all
// the i's have exhausted we simply make all the other elements 0.

public class MoveZeroes {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public void moveZeroes(int[] nums) {
        int j = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            if(nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        while(j <= nums.length - 1) {
            nums[j++] = 0;
        }
    }
}