package com.adnan.striver.sliding_window_and_two_pointers;

import java.util.Arrays;

// LeetCode 424: MEDIUM
// https://leetcode.com/problems/longest-repeating-character-replacement/

// Approach 1: We maintain a window a follow a formula. We keep increasing the window
// until we find that the characters to be replaced are more than k. At which point
// we shrink the window.

// Approach 2: Same as approach 1, but we improve the constant factor of calculating the max.
// We don't have to keep calculating the max everytime we can simply keep track of a global max.
// That is because we only care about max window and global maxf might become stale but it still
// gives out correct answer.

// NOTE:
// total_characters_in_window = most_frequent_character + characters_to_replace
// characters_to_replace = total_characters_in_window - most_frequent_character

public class LongestRepeatingCharacterReplacement {

    // Time Complexity: O(n + 26 * n) ~ O(26 * n) ~ O(n)
    // Space Complexity: O(26) ~ O(1)
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        Arrays.fill(map, 0);

        int j = 0; int maxWindow = 0;
        for(int i = 0; i <= s.length() - 1; i++) {
            map[s.charAt(i) - 'A']++;

            while((i - j  + 1) - max(map) > k) {
                map[s.charAt(j) - 'A']--;
                j++;
            }

            maxWindow = Math.max(maxWindow, i - j + 1);
        }

        return maxWindow;
    }

    private int max(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int num: nums) {
            max = Math.max(max, num);
        }

        return max;
    }

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(26) ~ O(1)
//    public int characterReplacement(String s, int k) {
//        int[] map = new int[26];
//        Arrays.fill(map, 0);
//
//        int j = 0; int maxWindow = 0; int maxf = 0;
//        for(int i = 0; i <= s.length() - 1; i++) {
//            char ch = s.charAt(i);
//            map[ch - 'A']++;
//            maxf = Math.max(maxf, map[ch - 'A']);
//
//            while((i - j  + 1) -  maxf > k) {
//                map[s.charAt(j) - 'A']--;
//                j++;
//            }
//
//            maxWindow = Math.max(maxWindow, i - j + 1);
//        }
//
//        return maxWindow;
//    }
}