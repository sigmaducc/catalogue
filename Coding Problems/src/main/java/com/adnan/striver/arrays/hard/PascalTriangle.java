package com.adnan.striver.arrays.hard;

import java.util.ArrayList;
import java.util.List;

// Leetcode 118: EASY

// Approach 1: For levle 0 and level 1 simply add 1 and 1,1 to list and return;
// Then we start from level 2 and go until n. For each level we first add 1 to list.
// Then we take 2 consecutive numbers from prev element in list and add them
// and then append to the list. We do this until last of prev element is reached in
// list. Finally, we add 1 again. And add this whole nested list into main list.

public class PascalTriangle {

    // Time Complexity: O(numRows * numRows) ~ O(n^2)
    // Space Complexity: O(numRows * numRows/2) ~ O(n^2)
    public List<List<Integer>> generate(int numRows) {
        int n = numRows - 1;
        int level = 0;
        List<List<Integer>> list = new ArrayList<>();

        if(0 <= n) {
            list.add(List.of(1));
            level++;
        }

        if(1 <= n) {
            list.add(List.of(1, 1));
            level++;
        }

        while(level >= 2 && level <= n) {
            List<Integer> prev = list.getLast();
            List<Integer> next = new ArrayList<>();

            next.add(1);
            for(int i = 1; i <= prev.size() - 1; i++) {
                int a = prev.get(i-1);
                int b = prev.get(i);
                next.add(a+b);
            }
            next.add(1);

            list.add(next);
            level++;
        }

        return list;
    }
}