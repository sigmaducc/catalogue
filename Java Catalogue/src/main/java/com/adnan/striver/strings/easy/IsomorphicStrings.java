package com.adnan.striver.strings.easy;

import java.util.HashMap;
import java.util.Map;

// LeetCode 205: EASY
// https://leetcode.com/problems/isomorphic-strings/

// In approach 1:
// We use 2 hashmaps for bidirectional checks. Each hashmap
// can grow as much as 128 or 256 ASCII characters.
// Hence, our hashmap would not grow a lot.

// In approach 2:
// Here instead of using hashmap we are using arrays of size 128.
// We increment the position of a char in ascii array by the index size.
// If at any point we will get double mapping we will exit because the
// numbers won't match.

public class IsomorphicStrings {

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(256 + 256) ~ O(1)
//    public boolean isIsomorphic(String s, String t) {
//        if(s.length() != t.length()) return false;
//
//        Map<Character, Character> s2t = new HashMap<>();
//        Map<Character, Character> t2s = new HashMap<>();
//
//        for(int i = 0; i <= s.length() - 1; i++) {
//            char sc = s.charAt(i);
//            char tc = t.charAt(i);
//
//            s2t.put(sc, tc);
//            t2s.put(tc, sc);
//        }
//
//        for(int i = 0; i <= t.length() - 1; i++) {
//            char tc = t.charAt(i);
//            char sc = s.charAt(i);
//
//            if(!s2t.containsKey(sc) || !t2s.containsKey(tc)) return false;
//            if(sc != t2s.get(tc) || tc != s2t.get(sc)) return false;
//        }
//
//        return true;
//    }

    // Time Complexity: O(n)
    // Space Complexity: O(128 + 128) ~ O(1)
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] ascii_s = new int[128];
        int[] ascii_t = new int[128];

        for(int i = 0; i <= s.length() - 1; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(ascii_s[sc] != ascii_t[tc]) return false;

            ascii_s[sc] = i+1;
            ascii_t[tc] = i+1;
        }

        return true;
    }
}