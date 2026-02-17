package com.adnan.striver.arrays.medium;

import java.util.ArrayList;
import java.util.List;

// Non leetcode question (but from striver sheet)

public class LeadersInAnArray {
    public List<Integer> leaders(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] > max) {
                max = nums[i];
                list.add(nums[i]);
            }
        }

        reverse(list);

        return list;
    }

    private void reverse(List<Integer> list) {
        int i = 0;
        int j = list.size() - 1;

        while(i < j) {
            int temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);

            i++;
            j--;
        }
    }
}