package com.adnan.striver.bit_manipulation;

// LeetCode 2433: MEDIUM
// https://leetcode.com/problems/find-the-original-array-of-prefix-xor/

// Approach: We cancel the prev xor element by xor'ing again but before
// that we simply xor the next element because that is what's required.

// xor = 0
// 5 = 0^0^5 = here we added 0^5 = 5
// 2 = 5^5^2 = here we added 5^2 = 7
// 0 = 2^2^0 = here we added 2^0 = 2
// 3 = 0^0^3 = here we added 0^3 = 3
// 1 = 3^3^1 = here we added 3^1 = 2
// And this is the final answer.

public class FindTheOriginalArrayOfPrefixXor {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int[] findArray(int[] pref) {
        int xor = 0;

        for(int i = 0; i <= pref.length - 1; i++) {
            pref[i] = xor ^ pref[i];
            xor = xor ^ pref[i];
        }

        return pref;
    }
}