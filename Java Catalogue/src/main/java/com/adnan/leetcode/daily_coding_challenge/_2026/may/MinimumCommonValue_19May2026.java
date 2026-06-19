package com.adnan.leetcode.daily_coding_challenge._2026.may;

public class MinimumCommonValue_19May2026 {

    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0; int j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                i++;
            } else if(nums1[i] > nums2[j]) {
                j++;
            } else {
                return nums1[i];
            }
        }

        return -1;
    }
}