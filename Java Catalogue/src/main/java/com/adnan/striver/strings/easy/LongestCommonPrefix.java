package com.adnan.striver.strings.easy;

// LeetCode 14: EASY
// https://leetcode.com/problems/longest-common-prefix/

// Approach 1: We can find the min length from all the string elements.
// We then check each element of first string (from 0 .. min) against
// respective characters of all the other strings. Whenever there is
// a match we add it to string else we return string until that point.

// Approach 2: We sort the string array which will sort it lexicographically.
// So we can simply check for first and last element. And return if there
// is a mismatch.

public class LongestCommonPrefix {

    // Time Complexity: O(min(strs) * n) ~ O(n^2)
    // Space Complexity: O(1) or O(n)
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= strs.length - 1; i++) {
            min = Math.min(min, strs[i].length());
        }

        for(int i = 0; i <= min-1; i++) {
            String s = strs[0];
            for(int j = 1; j <= strs.length - 1; j++) {
                if(strs[j].charAt(i) != s.charAt(i))
                    return sb.toString();
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    // Time Complexity: O(n * log n + O(n)) ~ O(n * log n)
    // Space Complexity: O(1) or O(n)
//    public String longestCommonPrefix(String[] strs) {
//        StringBuilder sb = new StringBuilder();
//        Arrays.sort(strs);
//
//        String first = strs[0];
//        String last = strs[strs.length - 1];
//        int min = Math.min(first.length(), last.length());
//
//        for(int i = 0; i <= min - 1; i++) {
//            if(first.charAt(i) != last.charAt(i)) {
//                return sb.toString();
//            }
//
//            sb.append(last.charAt(i));
//        }
//
//        return sb.toString();
//    }
}