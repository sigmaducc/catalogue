package com.adnan.striver.binary_search.array_1d;

// LeetCode 540: MEDIUM
//https://leetcode.com/problems/single-element-in-a-sorted-array/description/

// Approach: Here we use a trick of indexes.
// index:    [0,1,2,3,4,5,6,7,8]  Here: mid-element is at even index, so if next element is
// elements: [1,1,2,3,3,4,4,8,8]  same that means single element does not lie in the right part.
//                    ^
// index:    [0,1,2,3,4,5,6]  Here: mid-element is at odd index, so if prev element is same
// elements: [1,1,3,3,2,4,4]  that means the single element does not lie in the left part.
//                  ^
// If we come across an element 3 possibilities can exist.
// 1. Left is same as current
// 2. Right is same as current
// 3. Both are different meaning - single element is found
// So (even, odd) -> this should be the check to determine where to move.
// When we are at an even index and current == next that means there were no single elements
// previous to this. So, we move right by moving low pointer. If not that means the single
// element is in the left part so we move high pointer.
// Similarly, when we are at odd index and prev == current that means there were no single
// elements before this. So, we move right by moving low pointer. If not that means the
// single element is in the left part so we move our high pointer.

public class SingleElementInASortedArray {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int low = 0; int high = n - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            int prev = mid == 0 ? Integer.MIN_VALUE : nums[mid-1];
            int next = mid == nums.length - 1 ? Integer.MIN_VALUE : nums[mid+1];

            if(prev != nums[mid] && nums[mid] != next) {
                return nums[mid];
            } else {
                if(mid % 2 == 0) {
                    if(nums[mid] == next) {
                        low = mid+1;
                    } else {
                        high = mid-1;
                    }
                } else {
                    if(prev == nums[mid]) {
                        low = mid+1;
                    } else {
                        high = mid-1;
                    }
                }
            }
        }

        return -1;
    }
}