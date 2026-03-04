package com.adnan.striver.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LeetCode 18: MEDIUM
// https://leetcode.com/problems/4sum/

// Refer 3 sum problem. Same approach but extended to 4 sum.

public class FourSum {

    // Time Complexity: O(n * log n + n * n * n) ~ O(n^3)
    // Space Complexity: O(n) or O(1)
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i <= nums.length - 1; i++) {
            if(i > 0 && nums[i-1] == nums[i]) continue;
            for(int j = i+1; j <= nums.length - 1; j++) {
                if(j > i+1 && nums[j-1] == nums[j]) continue;

                int left = j+1;
                int right = nums.length - 1;

                // a + b + c + d = target
                // c + d = target - a - b
                long newTarget = (long) target - nums[i] - nums[j];

                while(left < right) {
                    long sum = (long) nums[left] + nums[right];

                    if(sum == newTarget) {
                        list.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left++;

                        while(left < right && nums[left-1] == nums[left]) left++;
                        while(right < nums.length - 1 && nums[right] == nums[right+1]) right--;
                    } else if(sum < newTarget) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return list;
    }
}