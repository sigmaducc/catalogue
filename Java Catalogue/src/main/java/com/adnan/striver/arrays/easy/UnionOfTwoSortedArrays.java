package com.adnan.striver.arrays.easy;

import java.util.ArrayList;
import java.util.List;

// Non LeetCode question (but from striver sheet)

public class UnionOfTwoSortedArrays {
    public List<Integer> union(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = 0;

        while(left <= arr1.length - 1 && right <= arr2.length - 1) {
            if(arr1[left] < arr2[right]) {
                if(list.isEmpty() || list.getLast() != arr1[left])
                    list.add(arr1[left]);

                left++;
            } else if(arr1[left] == arr2[right]) {
                if(list.isEmpty() || list.getLast() != arr1[left])
                    list.add(arr1[left]);

                left++;
                right++;
            } else {
                if(list.isEmpty() || list.getLast() != arr2[right])
                    list.add(arr2[right]);

                right++;
            }
        }

        if(left >= arr1.length) {
            while(right <= arr2.length - 1) {
                if(list.isEmpty() || list.getLast() != arr2[right])
                    list.add(arr2[right]);

                right++;
            }
        }

        if(right >= arr2.length) {
            while(left <= arr1.length - 1) {
                if(list.isEmpty() || list.getLast() != arr1[left])
                    list.add(arr1[left]);

                left++;
            }
        }

        return list;
    }
}