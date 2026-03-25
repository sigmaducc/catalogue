package com.adnan.striver.bit_manipulation;

// Non LeetCode question (but from striver sheet)

public class FindXorFromLToR {

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int xor(int l, int r) {

        return xor(l-1) ^ xor(r);
    }

    private int xor(int n) {
        if(n % 4 == 0) return n;
        if(n % 4 == 1) return 1;
        if(n % 4 == 2) return n+1;
        if(n % 4 == 3) return 0;

        return n;
    }
}