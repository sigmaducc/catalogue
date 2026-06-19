package com.adnan.leetcode.daily_coding_challenge._2026.may;

public class CountTheNumberOfSpecialCharacters1_26May2026 {

    public int numberOfSpecialChars(String word) {
        int lower = 0;
        int upper = 0;

        for(char c: word.toCharArray()) {
            if('a' <= c && c <= 'z')
                lower = lower | (1 << (c - 'a'));
            else if('A' <= c && c <= 'Z')
                upper = upper | (1 << (c - 'A'));
        }

        int common = lower & upper;

        return Integer.bitCount(common);
    }
}