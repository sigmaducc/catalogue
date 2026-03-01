package com.adnan.striver.binary_search.array_1d;

// LeetCode 162: MEDIUM
// https://leetcode.com/problems/find-peak-element/

// Approach: Imagine 4 scenarios
//
// 1.       current
//          /    \
//       prev    next
//
// 2.
//           next
//            /
//        current
//         /
//      prev
//
// 3.
//      prev   next
//         \  /
//        current
//
// 4.
//     prev
//        \
//      current
//          \
//          next
//
// These scenarios help, in determining where to move based on the slope.
// If prev is smaller than current -> then 2 scenarios exist: either the next is smaller
// that current in which case it is peak or else next is bigger meaning the slope
// is +ve so we move right by moving low pointer.
// If prev is bigger than current -> then 2 scenarios exist: either next is smaller than
// current or next is bigger tha current in either case it doesn't matter because slope
// is -ve so we move to left by moving high pointer.

public class FindPeakElement {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high-low)/2;

            int prev = mid-1 < 0 ? Integer.MIN_VALUE : nums[mid-1];
            int next = mid+1 > nums.length - 1 ? Integer.MIN_VALUE : nums[mid+1];

            if(prev <= nums[mid]) {
                if(next <= nums[mid]) {
                    return mid;
                } else {
                    low = mid+1;
                }
            } else {
                high = mid-1;
            }
        }

        return 0;
    }
}