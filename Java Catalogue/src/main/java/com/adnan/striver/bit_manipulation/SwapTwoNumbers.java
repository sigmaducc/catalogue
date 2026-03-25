package com.adnan.striver.bit_manipulation;

// Non LeetCode question (but from striver sheet)

public class SwapTwoNumbers {

    public void swap(int[] nums) {
        if(nums.length == 0 || nums.length > 2) return;
//        a = a ^ b;
//        b = a ^ b; // a ^ b ^ b = a
//        a = a ^ b; // a ^ b ^ a ^ b ^ b = b

        nums[0] = nums[0] ^ nums[1];
        nums[1] = nums[0] ^ nums[1];
        nums[0] = nums[0] ^ nums[1];

    }
}