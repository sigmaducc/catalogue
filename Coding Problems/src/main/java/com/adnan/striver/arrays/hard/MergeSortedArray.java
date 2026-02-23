package com.adnan.striver.arrays.hard;

// LeetCode 88: EASY
// https://leetcode.com/problems/merge-sorted-array/

// Approach 1: Make an array of size m and store all elements from nums1
// until m in that. Then iterate over this m array and nums2 by using two pointers.
// One pointer for nums1 array. So total 3 pointers. When we insert in nums1 we
// increment iterator for nums1. When we add from m array we increment i and when
// we add from nums2 we increment j. When either i or j reaches the end. We stop
// the main loop. Finally, we check if our either pointer has crossed the limits.
// If it has then we take all the elements from the other array and put it all
// in this resultant array.
// Note: when values are equal it doesn't matter which one is inserted first.

// Approach 2: Similar to approach one but we do not use extra space. We simply
// start from end instead of start. And that fixes almost all issues.
// Edge cases need to be handled. Eg when n is 0 nothing to be done. But when m is 0
// We need to add all the elements from nums2 into nums1.

public class MergeSortedArray {

    // Time Complexity: O(m+n)
    // Space Complexity: O(1)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) return;

        if(m == 0) {
            while(--n >= 0) {
                nums1[m+n] = nums2[n];
            }
        }

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i >= 0 && j >= 0 && k >= 0) {
            if(nums2[j] >= nums1[i]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }

        while(j >= 0 && k >= 0) {
            nums1[k--] = nums2[j--];
        }

        while(i >= 0 && k >= 0) {
            nums1[k--] = nums1[i--];
        }
    }

    // Time Complexity: O(m+n)
    // Space Complexity: O(m)
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        if(n == 0) return;
//
//        if(m == 0) {
//            while(--n >= 0) {
//                nums1[m+n] = nums2[n];
//            }
//
//            return;
//        }
//
//        int[] mArr = new int[m];
//
//        for(int i = 0; i <= m-1; i++) {
//            mArr[i] = nums1[i];
//        }
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while(i <= m-1 && j <= n-1 && k <= m+n-1)  {
//            if(mArr[i] <= nums2[j]) {
//                nums1[k++] = mArr[i];
//                i++;
//            } else {
//                nums1[k++] = nums2[j];
//                j++;
//            }
//        }
//
//        while(i <= m-1 && k <= m+n-1) {
//            nums1[k++] = mArr[i++];
//        }
//
//        while(j <= n-1 && k <= m+n-1) {
//            nums1[k++] = nums2[j++];
//        }
//    }
}