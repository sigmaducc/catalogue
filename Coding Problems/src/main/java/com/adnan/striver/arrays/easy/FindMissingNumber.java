package com.adnan.striver.arrays.easy;

import java.util.Arrays;

// Non leetcode question (but from striver sheet)

public class FindMissingNumber {

    // Time Complexity: O(n+n) ~ O(n)
    // Space Complexity: O(1)
    public int missingNum(int[] nums) {
        int xor1 = 0; int xor2 = 0;

        for(int i = 0; i <= nums.length - 1; i++) {
            xor1 ^= nums[i];
        }

        for(int i = 1; i <= nums.length+1; i++) {
            xor2 ^= i;
        }

        return xor1 ^ xor2;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
//    public int missingNum(int[] nums) {
//        long expectedSum = (long) (nums.length+1) * (nums.length+2) / 2;
//        long sum = 0;
//        for(int i = 0; i <= nums.length - 1; i++) {
//            sum += nums[i];
//        }
//
//        return (int) (expectedSum - sum);
//    }

    // Time Complexity: O(n+n+n) ~ O(n)
    // Space Complexity: O(n)
//    public int missingNum(int[] nums) {
//        int[] hash = new int[nums.length + 2];
//
//        for(int i = 0; i <= hash.length - 1; i++) {
//            hash[i] = 0;
//        }
//
//        for(int i = 0; i <= nums.length - 1; i++) {
//            hash[nums[i]]++;
//        }
//
//        for(int i = 1; i <= hash.length - 1; i++) {
//            if(hash[i] == 0) return i;
//        }
//
//        return -1;
//    }

    // Time Complexity: O(n * log n)
    // Space Complexity: O(1)
//    public int missingNum(int[] nums) {
//        Arrays.sort(nums);
//
//        if(nums[0] != 1) return 1;
//
//        for(int i = 1; i <= nums.length - 1; i++) {
//            if(nums[i]+1 != nums[i+1]) {
//                return nums[i]+1;
//            }
//        }
//
//        return -1;
//    }

    // Time Complexity: O(n ^ 2)
    // Space Complexity: O(1)
//    public int missingNum(int[] nums) {
//        int n = 1;
//
//        while(n <= nums.length - 1) {
//            boolean found = false;
//            for(int i = 0; i <= nums.length - 1; i++) {
//                if(nums[i] == n) {
//                    found = true;
//                    break;
//                }
//            }
//
//            if(!found) break;
//
//            n++;
//        }
//
//        return n;
//    }
}