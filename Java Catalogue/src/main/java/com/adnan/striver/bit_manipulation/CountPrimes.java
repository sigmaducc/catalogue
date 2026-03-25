package com.adnan.striver.bit_manipulation;

import java.util.Arrays;

// LeetCode 204: MEDIUM
// https://leetcode.com/problems/count-primes/

// Algorithm: Sieve of Eratosthenes
// Approach: We maintain a boolean array for all the numbers until n.
// We mark all the elements as true meaning all are primes. Then we
// start with 2 and mark all the multiples of 2 as false. We repeat
// this for all the numbers until n. But one thing to note is that
// we do not go linearly instead we check if the square is less than
// n in such way we don't have to do redundant for loops.
// In the end we just count the true's from 2.

public class CountPrimes {

    // Time Complexity: O(log log n)
    // Space Complexity: O(1)
    public int countPrimes(int n) {
        if(n <= 2) return 0;

        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        for(int i = 2; i * i <= n - 1; i++) {
            if(primes[i]) {
                for(int j = i * i; j <= n - 1; j += i) {
                    primes[j] = false;
                }
            }
        }

        int counter = 0;
        for(int i = 2; i <= n - 1; i++) {
            if(primes[i]) counter++;
        }

        return counter;
    }

//    public int countPrimes(int n) {
//        if(n <= 2) return 0;
//
//        boolean[] primes = new boolean[n];
//        for(int i = 2; i * i <= n - 1; i++) {
//            if(!primes[i]) {
//                for(int j = i * i; j <= n - 1; j += i) {
//                    primes[j] = true;
//                }
//            }
//        }
//
//        int counter = 0;
//        for(int i = 2; i <= n - 1; i++) {
//            if(!primes[i]) counter++;
//        }
//
//        return counter;
//    }
}