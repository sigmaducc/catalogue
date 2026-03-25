package com.adnan.striver.bit_manipulation;

// LeetCode 260: MEDIUM
// https://leetcode.com/problems/single-number-iii/

// Approach: First we xor all the elements. Then the final xor would contain 2 numbers
// that are not duplicate. We find the first set bit in that xor'ed value. Then we loop
// through the array again and this time we put the elements in set and unset buckets
// based on the i'th position being either set or unset. In the end our 2 values would
// be in those buckets and simple we return them.

public class SingleNumber3 {

    // Time Complexity: O(n + 32 + n) ~ O(n)
    // Space Complexity: O(1)
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num: nums) xor ^= num;

        int i = 0;
        while ((xor & (1 << i)) == 0) i++;

        int set = 0; int unset = 0;
        for(int num: nums) {
            if((num & (1 << i)) == 0) {
                unset ^= num;
            } else {
                set ^= num;
            }
        }

        return new int[] {set, unset};
    }
}