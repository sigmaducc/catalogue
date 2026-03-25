package com.adnan.striver.bit_manipulation;

// LeetCode 29: MEDIUM
// https://leetcode.com/problems/divide-two-integers/

// Approach 1: We can simply keep reducing divisor from dividend
// because division is nothing but repeated subtraction. But that
// would be in-efficient when divisor is 1 and dividend is INT_MAX.

// Approach 2: We use binomial theorem because we know any number
// can be made from powers of 2. So, we reduce the dividend by some
// power of two and keep doing it until we find remainder lesser than
// divisor.
// NOTE: Few caveats, use longs to avoid int overflows and  manage sign
// in the start and before returning check for overflows.
// Main juice of the problem is finding this
// 35 - 3 * 2^3 = 11
// 11 - 3 * 2^1 = 5
// 5 - 3 * 2^0 = 2
// We stop at 2. At each step we maintain sum and ans and keep reducing the dividend.

public class DivideTwoIntegers {

    // Time Complexity: O(logn * logn) because each loop halves the dividend
    // Space Complexity: O(1)
    public int divide(int divid, int divis) {
        long ans = 0;
        int sign = 1;

        if(divid < 0) sign = -1 * sign;
        if(divis < 0) sign = -1 * sign;

        long dividend = divid;
        long divisor = divis;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while(dividend >= divisor) {
            long counter = 0;
            long sum = 0;

            while(sum < dividend) {
                counter++;
                sum += divisor << counter;
            }

            if(counter > 0) counter--;

            dividend = dividend - (divisor << counter);
            ans = ans + (1L << counter);
        }

        ans = sign * ans;

        if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) ans;
    }
}