package com.adnan.striver.arrays.easy;

public class LongestSubarrayWithSumKWithPositives {

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity O(1)
    public int longestSubarray(int[] nums, int k) {
        int max = 0;
        long sum = 0;
        int i = 0;
        int j = 0;
        while(i <= nums.length - 1 && j <= nums.length - 1) {
            if(sum == k) {
                max = Math.max(max, j - i);
                sum -= nums[i++];
                sum += nums[j++];
            } else if(sum < k) {
                sum += nums[j++];
            } else if(sum > k) {
                sum -= nums[i++];
            }
        }

        return max;
    }
}