package com.adnan.striver.stack_queue;

// LeetCode 42: HARD
// https://leetcode.com/problems/trapping-rain-water/

// Approach 1: Using prefix and suffix sum.

// Approach 2: Using left and right pointer. We maintain a max on left and
// a max on right. We evaluate the lower max first and move ahead. Before
// adding to total we add a greater than check meaning the max should be
// bigger than building height.

public class TrappingRainWater {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        int l = 1; int r = n-2;
        int leftMax = height[0]; int rightMax = height[n-1];

        while(l < r) {
            if(height[l] <= height[r]) {
                if(leftMax > height[l])
                    total += leftMax - height[l];
                else
                    leftMax = height[l];

                l++;
            } else {
                if(rightMax > height[r])
                    total += rightMax - height[r];
                else
                    rightMax = height[r];

                r--;
            }
        }

        return total;
    }

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(n + n) ~ O(n)
//    public int trap(int[] height) {
//        int n = height.length;
//        int[] prefix = new int[n];
//        int[] suffix = new int[n];
//
//        int max1 = 0; int max2 = 0;
//        for(int i = 0; i <= n - 1; i++) {
//            if(height[i] >= max1) {
//                prefix[i] = 0;
//                max1 = height[i];
//            } else {
//                prefix[i] = max1;
//            }
//
//            int last = n - 1 - i;
//            if(height[last] >= max2) {
//                suffix[last] = 0;
//                max2 = height[last];
//            } else {
//                suffix[last] = max2;
//            }
//        }
//
//        int total = 0;
//        for(int i = 0; i <= n - 1; i++) {
//            int diff = Math.min(prefix[i], suffix[i]);
//
//            if(diff > 0) {
//                total += diff - height[i];
//            }
//        }
//
//        return total;
//    }
}