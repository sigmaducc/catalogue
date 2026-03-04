package com.adnan.striver.strings.easy;

// LeetCode 1903: EASY
// https://leetcode.com/problems/largest-odd-number-in-string/

// Approach: the given number is longest odd number if units place is not 2.
// But if it is 2 then we need to reduce the string from right one by one.
// If we find one odd number in (new) units place that means that is the
// longest odd number.

public class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if((c - '0') % 2 != 0)
                return num.substring(0, i+1);
        }

        return "";
    }
}