package com.adnan.striver.arrays.easy;

// Leetcode 189: MEDIUM

// It's basically just an advanced version of rotate and array by 1
// When rotating an array by 1 we just shift elements to right or left.

// If we shift elements to left we just copy right number on the left, but
// when we copy number from left to right we actually need to start from right end of the
// array because we cannot modify in the same direction we are iterating.

// NOTE: modulate the k value with array length in case it's bigger than the array.

// 1. In first approach you can just keep continuing to rotate the array by 1
// for every k. Which would give around O(n * k) time complexity because we
// rotate the array k times and each rotation can take at worst O(n).

// 2. Second approach is to use an array of size k. Keep k elements from
// right in this array. Basically n-k to n elements in this array. Then
// shift/copy elements from [0 - n-k] to [k - n] this would free up k spaces
// at the beginning of the array. We then use the auxiliary array we made
// for k elements and copy them over back to our original array.

// 3. In this third approach which is quite similar to approach 2, we simply
// make a copy of the original array. Then we shift/copy from copied array
// [0 - n-k] elements in original array [k - n] which frees up k spaces at the
// beginning of the original array. At last, we just copy over the last k elements
// from copied array in original array [0 - k].

// 4. Fourth approach is a mathematical trick. We divide the array into 2 parts
// [0, n-k] [n-k+1, n] and reverse the array by swapping opposite index numbers.
// That would give an array which has 2 reversed halves. Finally, when we reverse
// this array we get an array which is rotated by k steps.

import java.util.Arrays;

public class RotateArray {

    // Time Complexity: O(n * k)
    // Space Complexity: O(1)
//    public void rotate(int[] nums, int k) {
//        while(k > 0) {
//            int temp = nums[nums.length - 1];
//            for(int i = nums.length - 2; i >= 0; i--) {
//                nums[i + 1] = nums[i];
//            }
//            nums[0] = temp;
//
//            k--;
//        }
//    }

    // Time Complexity: O(n + k)
    // Space Complexity: O(k)
//    public void rotate(int[] nums, int k) {
//        k = k % nums.length;
//
//        int[] kArr = new int[k];
//        int n = nums.length - 1;
//
//        for(int i = k; i > 0; i--) {
//            kArr[k - i] = nums[nums.length - i];
//        }
//
//        for(int i = n - k; i >= 0; i--) {
//            nums[i + k] = nums[i];
//        }
//
//        for(int i = 0; i < k; i++) {
//            nums[i] = kArr[i];
//        }
//    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
//    public void rotate(int[] nums, int k) {
//        k = k % nums.length;
//        int n = nums.length - 1;
//
//        int[] arr = Arrays.copyOf(nums, nums.length);
//
//        for(int i = 0; i <= n - k; i++) {
//            nums[i + k] = arr[i];
//        }
//
//        for(int i = 0; i < k; i++) {
//            nums[i] = arr[n - k + 1 + i];
//        }
//    }

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(1)
    public void reverse(int[] nums, int low, int high) {
        while(low <= high) {
            int temp = nums[high];
            nums[high] = nums[low];
            nums[low] = temp;
            low++;
            high--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length - 1;

        reverse(nums, 0, n-k);
        reverse(nums, n-k+1, n);
        reverse(nums, 0, n);
    }
}
