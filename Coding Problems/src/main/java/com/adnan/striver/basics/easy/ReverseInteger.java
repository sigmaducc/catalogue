package com.adnan.striver.basics.easy;

// Leetcode 7: (EASY)
//  https://leetcode.com/problems/reverse-integer/

// Using a simple math trick. Dividing a number by 10 gives non-zeroth place digits
// of the number. And modulating a number by 10 gives the zeroth place digit

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