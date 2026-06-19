package com.adnan.leetcode.daily_coding_challenge._2026.may;

import java.util.Arrays;

public class MaximumNumberOfJumpsToReachTheLastIndex_10May2026 {

    public int maximumJumps(int[] nums, int target) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, -1);
        arr[0] = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            if(arr[i] == -1) continue;
            for(int j = i + 1; j <= nums.length - 1; j++) {
                int diff = nums[j] - nums[i];
                if(-target <= diff && diff <= target) {
                    arr[j] = Math.max(arr[j], arr[i] + 1);
                }
            }
        }

        return arr[nums.length - 1];
    }
}