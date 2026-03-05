package com.adnan.striver.strings.medium;

// LeetCode 5: MEDIUM
// https://leetcode.com/problems/longest-palindromic-substring/
// TODO: MANACHER's ALGORITHM

// Approach: We maintain a max substring variable whenever we update
// this max variable we store the lowest and highest point. The trick
// is to start checking from middle of a string instead of starting
// from the ends. So we check like a ripple and store the max ripple,
// and it's respective lowest and highest point.
// In the end we simply return the substring from lowest to highest point.

public class LongestPalindromicSubstring {

    // Time Complexity: O(n * n) ~ O(n ^ 2)
    // Space Complexity: O(1)
    public String longestPalindrome(String s) {
        int[] arr = new int[5];
        // 0 -> max
        // 1 -> lowest
        // 2 -> highest
        // 3 -> low
        // 4 -> high

        for(int i = 0; i <= s.length() - 1; i++) {
            arr[3] = i; arr[4] = i;
            measureLongestPalindrome(s, arr);

            arr[3] = i; arr[4] = i+1;
            measureLongestPalindrome(s, arr);
        }

        return s.substring(arr[1], arr[2] + 1);
    }

    private void measureLongestPalindrome(String s, int[] arr) {
        int low = arr[3]; int high = arr[4];
        while(low >= 0 && high <= s.length() - 1 && s.charAt(low) == s.charAt(high)) {
            int range = high - low + 1;
            if(range > arr[0]) {
                arr[0] = range;
                arr[1] = low;
                arr[2] = high;
            }

            low--;
            high++;
        }
    }
}