package com.adnan.striver.sliding_window_and_two_pointers;

import java.util.HashSet;
import java.util.Set;

// LeetCode 3: MEDIUM
// https://leetcode.com/problems/longest-substring-without-repeating-characters/

// Approach 1: We keep adding every char to the set until we encounter a char
// that is already present in the set. We keep removing chars until duplicate
// char is removed. At each step we maintain a maxlength;

// Approach 2: This approach is little optimized but less readable. We maintain
// a map of 256 chars and mark all as non-visited. When we encounter a char we mark
// it as visited, but before we need to check if that char was already visited if it
// was already visited we just take the next index. We mark visited not using 1 but
// using index. We only take next index as j when our j is smaller than the index we got.
// This approach would be best understood if we do it by hand on paper.

public class LongestSubstringWithoutRepeatingCharacters {

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(256) ~ O(1)
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0; int j = 0;
        for(int i = 0; i <= s.length() - 1; i++) {
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }

            set.add(s.charAt(i));
            max = Math.max(max, i - j + 1);
        }

        return max;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(256) ~ O(1)
//    public int lengthOfLongestSubstring(String s) {
//        int[] map = new int[256];
//        Arrays.fill(map, -1);
//        int max = 0;
//        int j = 0;
//        for(int i = 0; i <= s.length() - 1; i++) {
//            char c = s.charAt(i);
//
//            if(map[c] != -1) {
//                int idx = map[c];
//                if(j <= idx)
//                    j = idx + 1;
//            }
//
//            int len = i - j + 1;
//            max = Math.max(max, len);
//            map[c] = i;
//        }
//
//        return max;
//    }
}