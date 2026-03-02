package com.adnan.striver.binary_search.answers;

// LeetCode 1539: EASY
// https://leetcode.com/problems/kth-missing-positive-number/

// Approach: Use the index as trick. Ideally if the number is not missing it should
// have constant difference between all the elements and their indexes.
// Eg: k = 5
// [0,1,2,3,4]
// [2,3,4,7,11]
// Here, the difference between first 3 elements is 2.
// For 7 the difference is 3 and for 11 the difference is 7.
// So, 7-3-1= 3 missing numbers inclusive of 7.
// Similarly, 11-4-1=6 missing numbers inclusive of 11.
// Hence, if the missing numbers is lesser than k then we move right else we move left.

public class KthMissingPositiveNumber {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            int missing = arr[mid] - mid - 1;

            if(missing < k) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return low + k;
    }
}