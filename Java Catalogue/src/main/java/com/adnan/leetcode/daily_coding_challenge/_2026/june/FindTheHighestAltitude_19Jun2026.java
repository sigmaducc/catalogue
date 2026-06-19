package com.adnan.leetcode.daily_coding_challenge._2026.june;

public class FindTheHighestAltitude_19Jun2026 {

    public int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;
        for(int g: gain) {
            sum += g;
            max = Math.max(sum, max);
        }

        return max;
    }
}