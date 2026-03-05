package com.adnan.striver.strings.medium;

import java.util.*;

// LeetCode 451: MEDIUM
// https://leetcode.com/problems/sort-characters-by-frequency/

// Approach: We use a simple 128 size array to store the frequency of all the characters.
// Then we go through the elements of the array meaning frequencies. If the frequency is
// non-zero, we add it to tree map. Trick is to construct a tree map with frequency as
// key because treemap always sorts on key. And for each frequency keep track of elements
// that have that frequency. In the end simply iterate over map entries, and construct the
// required string.

public class SortCharactersByFrequency {

    // Time Complexity: O(n + 128 * log 128 + 128 or n) ~ O(n)
    // Space Complexity: O(128 + 128) ~ O(1)
    public String frequencySort(String s) {
        int[] arr = new int[128];
        Map<Integer, List<Character>> treemap = new TreeMap<>((a, b) -> b - a);

        for(char c: s.toCharArray()) arr[c]++;

        for(int i = 0; i <= 127; i++) {
            char c = (char) i;
            int count = arr[i];

            if(count == 0) continue;

            if(treemap.containsKey(count)) {
                treemap.get(count).add(c);
            } else {
                treemap.put(count, new ArrayList<>(List.of(c)));
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, List<Character>> entry: treemap.entrySet()) {
            int count = entry.getKey();
            List<Character> list = entry.getValue();

            for(char c: list) {
                int n = count;

                while(n-- > 0) sb.append(c);
            }
        }

        return sb.toString();
    }
}