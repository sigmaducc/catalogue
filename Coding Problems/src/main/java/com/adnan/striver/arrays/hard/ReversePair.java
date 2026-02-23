package com.adnan.striver.arrays.hard;

// LeetCode 493: HARD
// https://leetcode.com/problems/reverse-pairs/

// Approach: We need to find pairs that satisfy this condition:
// 1. i < j
// 2. nums[i] > 2 * nums[j]
// We can try bruteforce solution but it will timeout with O(n^2)
// Since, this is like a comparison we can try to use a sorting algorithm.
// Merge sort is the best algorithm for this problem. We divide the array
// into subunits. Then compare those units and maintain counter at each level.
// We first divide the array and then before merging we count the pairs.
// The trick is that when solving with 2 sorted arrays we can iterate over the
// first array and compare with first element of another sorted array.
// Now, the condition may be or may not be satisfied with nums[j]
// Let's assume it doesn't satisfy so in that case we simply go to next i.
// When it matches the condition  we increment right pointer until we find a
// number which breaks the condition. Up until that point we know those pairs
// will all go with all the i's because if it goes with first i it will go with
// all the other i's. Reason being, RHS is same but nums[i] keeps increasing hence
// it satisfies the condition at each i.

public class ReversePair {

    // Time Complexity: O(n * log n)
    // Space Complexity: O(n)
    public int reversePairs(int[] nums) {
        int[] aux = new int[nums.length];

        return mergeSort(nums, aux, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int[] aux, int low, int high) {
        if(low >= high) return 0;

        int mid = low + (high-low)/2;

        int a = mergeSort(nums, aux, low, mid);
        int b = mergeSort(nums, aux, mid+1, high);
        int c = count(nums, low, mid, high);
        merge(nums, aux, low, mid, high);

        return a+b+c;
    }

    private int count(int[] nums, int low, int mid, int high) {
        int counter = 0;
        int left = low;
        int right = mid+1;

        while(left <= mid) {
            while(right <= high && nums[left] > (long) 2 * nums[right]) right++;
            counter += (right - (mid + 1));
            left++;
        }

        return counter;
    }

    private void merge(int[] nums, int[] aux, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        int k = low;

        for(int i = low; i <= high; i++) {
            aux[i] = nums[i];
        }

        while(left <= mid && right <= high) {
            if(aux[left] <= aux[right]) {
                nums[k++] = aux[left++];
            } else {
                nums[k++] = aux[right++];
            }
        }

        while(left <= mid) {
            nums[k++] = aux[left++];
        }

        while(right <= high) {
            nums[k++] = aux[right++];
        }
    }
}