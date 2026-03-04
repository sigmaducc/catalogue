package com.adnan.striver.binary_search.answers;

// LeetCode 4: HARD
// https://leetcode.com/problems/median-of-two-sorted-arrays/

// Approach:
// [1,3,4,8,10]
// [4,7,10,12,15,20,22]
// We take low and high in lower array and mid as well.
// For an array of size N to be sorted we know N/2 + N/2 should be sorted as well.
// Here, we have two sorted arrays of size M and N. So we need to find at least (M+N)/2
// which is the mid-element in case it's odd or ((M+N) + (M+N) + 1) / 2;
// To achieve this, we take an array of size (M+N)/2 -> which will be made using
// some elements from array m and some elements from n array.
// We can take 0 element from M array or M elements from array so this is our search space.
// We find the partition of M using binary search. We now have partition of array M.
// (M+N)/2 - partition would give us the partition for array N.
// Now having all these in place we just need to make a simple comparison.
// Elements on the left of partition should always be smaller than the opposite elements on the right.
// If that is the case we know we have found the median and just check for odd and even and return accordingly.
// If it is odd then we return the min(r1, r2)
// If it is even then we return (max(l1, l2) + min(r1,r2)) / 2
// In case l1 is bigger than r2. We know we need to reduce l1 meaning we move left.
// And vice versa ie: If r1 is smaller than l2 then we know we need to increase r1 so we move right.

public class MedianOfTwoSortedArrays {

    // Time Complexity: O(log min(M, N))
    // Space Complexity: O(1)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int total = nums1.length + nums2.length;
        int low = 0;
        int high = nums1.length;

        while(low <= high) {
            int cut1 = low + (high-low) / 2;

            int cut2 = total/2 - cut1;
            int l1 = cut1 <= 0 ? Integer.MIN_VALUE : nums1[cut1-1];
            int l2 = cut2 <= 0 ? Integer.MIN_VALUE : nums2[cut2-1];
            int r1 = cut1 >= nums1.length ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = cut2 >= nums2.length ? Integer.MAX_VALUE : nums2[cut2];

            if(l1 <= r2 && l2 <= r1) {
                if(total % 2 != 0) {
                    return Math.min(r1, r2);
                } else {
                    return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
                }
            } else if(l1 > r2) {
                high = cut1-1;
            } else {
                low = cut1+1;
            }
        }

        return -1;
    }

    // Time Complexity: O(m + n)
    // Space Complexity: O(m + n)
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int total = nums1.length + nums2.length;
//        int[] aux = new int[total];
//
//        int i = 0; int j = 0; int k = 0;
//        while(i <= nums1.length - 1 && j <= nums2.length - 1) {
//            if(nums1[i] <= nums2[j]) {
//                aux[k++] = nums1[i++];
//            } else {
//                aux[k++] = nums2[j++];
//            }
//        }
//
//        while(i <= nums1.length - 1) aux[k++] = nums1[i++];
//        while(j <= nums2.length - 1) aux[k++] = nums2[j++];
//
//        int low = 0; int high = aux.length - 1;
//        int mid = low + (high-low)/2;
//
//        if(total % 2 != 0) return aux[mid];
//
//        return (double) (aux[mid] + aux[mid+1])/2;
//    }
}