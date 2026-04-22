package com.adnan.striver.recursion.medium;

import java.util.ArrayList;
import java.util.List;

// LeetCode 22: MEDIUM
// https://leetcode.com/problems/generate-parentheses/

// Approach: Think of it like a tree and everything falls into place.

// NOTE: Catalan number: Meaning valid parenthesis for n pairs
// total = C(2n, n)
// invalid = C(2n, n+1)
// valid = total sequences − invalid sequences
// Cₙ = C(2n,n) − C(2n,n+1)
// C(a, b) = a! / b! * b!

public class GenerateParentheses {

    // Time Complexity: O(Cn * n) or worst case O(2^n)
    // Space Complexity: O(Cn * n) or worst case O(2^n)
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(list, n, "(", 1, 0, 1);
        return list;
    }

    private void generate(List<String> list, int n, String s, int left, int right, int counter) {
        if (left > n) return;
        if (right > n) return;
        if (counter < 0) return;

        if (left == n && right == n)
            list.add(s);

        generate(list, n, s + "(", left + 1, right, counter + 1);
        generate(list, n, s + ")", left, right + 1, counter - 1);
    }
}