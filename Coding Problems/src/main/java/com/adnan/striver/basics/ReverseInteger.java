package com.adnan.striver.basics;

// Leetcode 7: (EASY)
//  https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            int rem = x % 10;
            x = x / 10;

            ans = ans * 10 + rem;
        }

        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) 
            return 0;
    
        return (int)ans;
    }
}