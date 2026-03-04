package com.adnan.striver.basics.easy.fibonacci;

// LeetCode: 509 (EASY)
// https://leetcode.com/problems/fibonacci-number/

// Fib(0) = 0
// Fib(1) = 1
// Fib(2) = Fib(1) + Fib(0) = 0 + 1 = 1
// Fib(3) = Fib(2) + Fib(1) = 1 + 1 = 2
// Fib(4) = Fib(3) + Fib(2) = 2 + 1 = 3
// Fib(5) = Fib(4) + Fib(3) = 3 + 2 = 5

// Need to start iteration from 1 because we always need to add 2 numbers to get sum;
// If we start from 0 the sum value won't be correct because it will only have 1 element for sum;

public class IterativeFibonacciNumber implements com.adnan.striver.basics.easy.fibonacci.BaseFibonacciNumber {
     public int fib(int n) {
         if(n == 0) return 0;
         if(n == 1) return 1;

         return fib(n - 1) + fib(n - 2);
     }
}