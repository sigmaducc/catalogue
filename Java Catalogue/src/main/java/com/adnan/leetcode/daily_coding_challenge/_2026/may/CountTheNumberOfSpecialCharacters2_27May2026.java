package com.adnan.leetcode.daily_coding_challenge._2026.may;

import java.util.Arrays;

public class CountTheNumberOfSpecialCharacters2_27May2026 {

    public int numberOfSpecialChars(String word) {
        int[][] lower = new int[26][2];
        int[][] upper = new int[26][2];

        for(int i = 0; i < 26; i++) {
            Arrays.fill(lower[i], Integer.MAX_VALUE);
            Arrays.fill(upper[i], Integer.MAX_VALUE);
        }

        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if('a' <= c && c <= 'z') {
                if(lower[c - 'a'][0] == Integer.MAX_VALUE) {
                    lower[c - 'a'][0] = i;
                } else {
                    lower[c - 'a'][1] = i;
                }
            } else if('A' <= c && c <= 'Z') {
                if(upper[c - 'A'][0] == Integer.MAX_VALUE) {
                    upper[c - 'A'][0] = i;
                } else {
                    upper[c - 'A'][1] = i;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < 26; i++) {
            if(upper[i][0] >= upper[i][1]) continue;
            if(lower[i][0] >= upper[i][0]) continue;
            if(lower[i][1] != Integer.MAX_VALUE && lower[i][1] >= upper[i][0]) continue;

            count++;
        }

        return count;
    }
}