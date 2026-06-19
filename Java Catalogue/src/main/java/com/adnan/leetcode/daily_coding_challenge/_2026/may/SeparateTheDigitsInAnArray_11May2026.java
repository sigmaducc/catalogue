package com.adnan.leetcode.daily_coding_challenge._2026.may;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeparateTheDigitsInAnArray_11May2026 {

    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int num: nums) {
            List<Integer> l = new ArrayList<>();
            while(num != 0) {
                l.add(num % 10);
                num = num / 10;
            }

            Collections.reverse(l);
            list.addAll(l);
        }

        int[] arr = new int[list.size()];

        for(int i = 0; i <= list.size() - 1; i++)
            arr[i] = list.get(i);

        return arr;
    }
}