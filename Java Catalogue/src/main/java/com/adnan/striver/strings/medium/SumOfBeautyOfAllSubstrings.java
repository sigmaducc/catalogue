package com.adnan.striver.strings.medium;

// LeetCode 1781: MEDIUM
// https://leetcode.com/problems/sum-of-beauty-of-all-substrings/

// Approach: Since, this is a substring problem hence bruteforce is the best approach.
// We simply apply the bruteforce and for each string we keep a map. We pick max and
// min and add diff to counter.

public class SumOfBeautyOfAllSubstrings {

    // Time Complexity: O(n * n * 26) ~ O(n^2)
    // Space Complexity: O(26) ~ O(1)
    public int beautySum(String s) {
        int totalBeauty = 0;
        for(int i = 0; i <= s.length() - 1; i++) {
            int[] a_z = new int[26];
            int max = 0;
            for(int j = i; j <= s.length() - 1; j++) {
                int c = s.charAt(j) - 'a';
                a_z[c]++;
                max = Math.max(a_z[c], max);
                int min = Integer.MAX_VALUE;
                for(int k : a_z) {
                    if(k != 0) min = Math.min(k, min);
                }

                totalBeauty += max - min;
            }
        }

        return totalBeauty;
    }
}