package com.adnan.striver.sorting2;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {

    public void radixSort(int[] nums) {
        int  maxDigits = Integer.MIN_VALUE;

        for(int i = 0; i <= nums.length - 1; i++) {
            int digits = (int) Math.log10(nums[i]) + 1;
            if(digits > maxDigits)
                maxDigits = digits;
        }

        for(int i = 1; i <= maxDigits; i++) {
            countSort(nums, i);
        }
    }

    private void countSort(int[] nums, int digitPlace) {
        List<List<Integer>> bucket = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            bucket.add(new ArrayList<>());
        }

        for(int i = 0; i <= nums.length - 1; i++) {
            double place = Math.pow(10, digitPlace - 1);
            int digit = (int) (nums[i] / place) % 10;

            bucket.get(digit).add(nums[i]);
        }

        int k = 0;
        for(int i = 0; i < 10; i++) {
            List<Integer> list = bucket.get(i);

            for(int el: list) {
                nums[k++] = el;
            }
        }
    }
}