package com.adnan.striver.arrays.medium;

// LeetCode 31: MEDIUM
// https://leetcode.com/problems/next-permutation/

// For number 123
// We get:  123
//          132
//          213
//          231
//          312
//          321

// In this question we need to give next permutation.
// We first check for the last permutation whose next permutation is nothing but the first permutation: 321 -> 123
// We simply return the reverse of the array. But how do we know if it is the last permutation. Last permutation means
// it is the largest number. For the largest number the digits will always be in decreasing order. So, if we iterate
// from back and find that a number is smaller (nums[i-1] < nums[i]) that means it is not the largest number.
// If we find the largest number we simply reverse and return it.
// But if it is not the largest number then we need to split the array by some index. This index is nothing but the one
// we calculated before. The index represents the first number which is smaller than the right number when iterating
// from back to front. When we get that we store it. The index also represents one more thing. Any number on the right
// of it will always be larger than the one at that index.
// So based on this we want to find the next permutation. Next permutation will nothing be just a number bigger than
// the current one. How big? Well that depends on the array to the right of it. We take the smallest number from the
// right array. And swap the index one with the smallest. That way on the left array we will have a number which is
// just big enough from the original permutation and not the biggest. On the right we still have things to do. It must
// be in decreasing order when we move from left to right in the right array. That means if we simply reverse the
// digits our job here will be done. So that is what we do!

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int index = -1;

        for(int i = nums.length - 1; i >= 1; i--) {
            if(nums[i-1] < nums[i]) {
                index = i-1;
                break;
            }
        }

        if(index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for(int i = nums.length - 1; i > index; i--) {
            if(nums[i] > nums[index]) {
                swap(nums, index, i);

                break;
            }
        }

        reverse(nums, index + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int from, int to) {
        while(from < to) {
            int temp = nums[from];
            nums[from] = nums[to];
            nums[to] = temp;

            from++;
            to--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}