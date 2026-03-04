package com.adnan.striver.binary_search.answers;

// LeetCode 1283: MEDIUM
// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

// Approach: Similar approach to Koko problem. If we divide all the elements by 1 - I get
// sum(nums) and If I divide each element by max(nums) I get nums.length. Now keeping this
// in mind we need to reduce/increase the threshold. Meaning there is an inverse relationship
// between the divisor and the sum we get. If we increase the divisor we get lesser sum and vice versa.
// so whenever we pick a divisor, and we get the sum lesser than threshold that means we need to lower
// our divisor because it is dividing too much.
// Now why do we return low? Because it is the lowest index where our condition exits. Meaning the point at
// which we can no longer minimize.
// Eg: [1,2,5,9] threshold=6

public class FindTheSmallestDivisorGivenAThreshold {

    // Time Complexity: O(n * log max(nums))
    // Space Complexity: O(1)
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Integer.MIN_VALUE;

        for(int i = 0; i <= nums.length - 1; i++) {
            if(nums[i] > high) high = nums[i];
        }

        while(low <= high) {
            int mid = low + (high-low)/2;

            long sum = 0;
            for(int i = 0; i <= nums.length - 1; i++) {
                sum += (nums[i] + mid - 1)/mid;
            }

            if(sum <= threshold) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return low;
    }
}