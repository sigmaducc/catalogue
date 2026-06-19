package com.adnan.leetcode.daily_coding_challenge._2026.may;

public class CheckIfArrayIsGood_14May2026 {

    public boolean isGood(int[] nums) {
        if(nums.length <= 1)
            return false;

        int[] map = new int[201];
        for(int num: nums) {
            map[num]++;
        }

        int n = 0;
        for(int num: map) {
            if(num != 0)
                n++;
        }

        if((n + 1) != nums.length)
            return false;

        for(int num: nums) {
            if(num > n) return false;
            if(map[num] > 1 && num != n) return false;
        }

        return true;
    }
}