package com.adnan.striver.arrays.medium;

// LeetCode 2149: Medium
// https://leetcode.com/problems/rearrange-array-elements-by-sign/

// There are 2 approaches:
//
// I came up with the first approach. I tried to keep 2 pointers.
// First pointer keeps track of the first encountered positive number and second
// pointer tracks the first encountered negative number. We keep incrementing the counter
// until we get positive and negative numbers on both pointer respectively. When we do we
// simply place them in the auxiliary array. One pointer to keep track of auxiliary arrays index.

// Second approach I found in solutions:
// The approach is simple. We interate over the array. If we find a positive number we put it in a
// pos array. If we find a negative number we put it in a neg array. Both array will not depend
// on i and will have their own index. After the iteration we will have 2 array of half size from
// the original array. Then we simply iterate from [0 - n/2] and place (pos, neg) number in the array.


public class RearrangeArrayElementsBySign {
//    public int[] rearrangeArray(int[] nums) {
//        int[] arr = new int[nums.length];
//
//        int n = nums.length - 1;
//
//        int posPointer = 0;
//        int negPointer = 0;
//        int k = 0;
//
//        while(posPointer <= n && negPointer <= n) {
//            while(nums[posPointer] < 0) {
//                posPointer++;
//            }
//
//            while(nums[negPointer] > 0) {
//                negPointer++;
//            }
//
//            arr[k++] = nums[posPointer++];
//            arr[k++] = nums[negPointer++];
//        }
//
//        return arr;
//    }

    // Time Complexity: O(n + n/2) ~ O(n)
    // Space Complexity: O(n + n) ~ O(n)
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];

        int p = 0;
        int n = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            if(nums[i] > 0) {
                pos[p++] = nums[i];
            } else {
                neg[n++] = nums[i];
            }

        }

        int k = 0;
        for(int i = 0; i < nums.length/2; i++) {
            arr[k++] = pos[i];
            arr[k++] = neg[i];
        }

        return arr;
    }
}
