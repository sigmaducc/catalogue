package com.adnan.striver.binary_search.answers;

// LeetCode 410: HARD
// https://leetcode.com/problems/split-array-largest-sum/

// Approach: Similar to capacity ship problem. Figure out the search space.
// If we take 1 as sum then we cannot divide the subarray because there will be larger elements.
// So we try to take the max(nums) in which case I can divide into n subarrays.
// But If I take sum(nums) then I can divide into 1 subarray.
// Now, my task is to split array into k arrays where the sum is the largest.
// Eg:
// [1,2,3,4,5]
// If we take 5 as sum then we can divide the array into 5 subarrays.
// If we take sum(nums) which is 15 we can divide the array into 1 subarray.
// Which is again inverse relationship.
// subarrays:   5 ... 1 (dec)
// sum:         5 ... 15 (inc)
// If I find sum which gives some number of subarray, and it is lesser than k then we know
// we need to go to left which will increase k and decrease sum.

public class SplitArrayLargestSum {

    // Time Complexity: O(log (sum(nums) - max(nums))
    // Space Complexity: O(1)
    public int splitArray(int[] nums, int k) {
        long low = Integer.MIN_VALUE;
        long high = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            high += nums[i];
            low = Math.max(low, nums[i]);
        }

        while(low <= high) {
            long mid = low + (high-low)/2;

            int kCount = countK(nums, mid);

            if(kCount <= k) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return (int)low;
    }

    private int countK(int[] nums, long mid) {
        int counter = 1;
        long sum = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];

            if(sum > mid) {
                sum = nums[i];
                counter++;
            }
        }

        return counter;
    }
}