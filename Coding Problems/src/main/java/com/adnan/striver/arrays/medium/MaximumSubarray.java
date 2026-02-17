package com.adnan.striver.arrays.medium;

// Leetcode 53: MEDIUM

// Using bruteforce approach we will easily get maxSum
// But it will eventually timeout because it is O(n^2) approach.

// Optimal version is Kadane's Algorithm: It should be used when you have to find
// maximum sum of contiguous array elements. If the array contains positive or negative
// elements this is the best approach. If the array has only positive elements then
// sliding window will probably be better. But I think Kadane's algorithm would still
// shine in whole positive array of elements.

public class MaximumSubarray {

    // Time Complexity: O(n * n)
    // Space Complexity: O(1)
//    public int maxSubArray(int[] nums) {
//        int maxSum = Integer.MIN_VALUE;
//        for(int i = 0; i <= nums.length - 1; i++) {
//            int sum = 0;
//            for(int j = i; j <= nums.length - 1; j++) {
//                sum += nums[j];
//
//                maxSum = Math.max(maxSum, sum);
//            }
//        }
//
//        return maxSum;
//    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        int sum = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i <= nums.length - 1; i++) {
            if(sum == 0) start = i;

            sum += nums[i];

            if(sum > maxSum) {
                end = i;
                maxSum = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }

        System.out.print("nums: [");
        for(int i = start; i <= end; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("]");

        return maxSum;
    }
}