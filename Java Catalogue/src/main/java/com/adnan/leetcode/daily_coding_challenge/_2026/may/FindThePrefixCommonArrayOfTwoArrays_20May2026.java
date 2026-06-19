package com.adnan.leetcode.daily_coding_challenge._2026.may;

public class FindThePrefixCommonArrayOfTwoArrays_20May2026 {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr = new int[A.length];

        long mask1 = 0;
        long mask2 = 0;
        for(int i = 0; i < A.length; i++) {
            int a = A[i];
            int b = B[i];

            mask1 = mask1 | (1L << a);
            mask2 = mask2 | (1L << b);

            arr[i] = Long.bitCount(mask1 & mask2);
        }

        return arr;
    }
}