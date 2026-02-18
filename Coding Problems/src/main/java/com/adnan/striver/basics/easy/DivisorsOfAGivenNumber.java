package com.adnan.striver.basics.easy;

import java.util.ArrayList;
import java.util.List;

// Non leetcode question (but from striver sheet)

public class DivisorsOfAGivenNumber {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
//    public List<Integer> getAllDivisors(int n) {
//        List<Integer> list = new ArrayList<>();
//
//        for(int i = 1; i <= n; i++) {
//            if(n % i == 0) {
//                list.add(i);
//            }
//        }
//
//        return list;
//    }

    // Time Complexity: O(sqrt(n))
    // Space Complexity: O(2 * sqrt(n))
    public List<Integer> getAllDivisors(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i*i <= n; i++) {
            if(n % i == 0) {
                list.add(i);

                if(i != n/i)
                    list.add(n/i);
            }
        }

        return list;
    }
}