package com.adnan.striver.strings.easy;

// LeetCode 242: EASY
// https://leetcode.com/problems/valid-anagram/

// Approach: Simply keep a map from a-z. For each character increase the counter
// for that character. Then we start decrementing for each char in other string.
// Finally, If we have an anagram we should have all elements as 0 count. If we
// find that some elements are lesser than 0 that means it is not a valid anagram.

public class ValidAnagram {

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(26) ~ O(1)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] chars = new int[26];

        for(char c: s.toCharArray()) chars[c - 'a']++;
        for(char c: t.toCharArray()) chars[c - 'a']--;

        for(int i = 0; i <= 25; i++) {
            if(chars[i] < 0)
                return false;
        }

        return true;
    }
}