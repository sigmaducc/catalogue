// Leetcode: 509 (EASY)
// https://leetcode.com/problems/fibonacci-number/

// Fib(0) = 0
// Fib(1) = 1
// Fib(2) = Fib(1) + Fib(0) = 0 + 1 = 1
// Fib(3) = Fib(2) + Fib(1) = 1 + 1 = 2
// Fib(4) = Fib(3) + Fib(2) = 2 + 1 = 3
// Fib(5) = Fib(4) + Fib(3) = 3 + 2 = 5

// Need to start iteration from 1 because we always need to add 2 numbers to get sum; 
// If we start from 0 the sum value won't be correct becuase it will only have 1 element for sum;

public class FibonnaciNumber {
    public static void main(String args[]) {
        long startTime = System.nanoTime();
        // for(int i = 0; i <= 50; i++) {
            System.out.println("Fib[" + 10 + "]: " + fib(10));
        // }
        long endTime = System.nanoTime();
        long durationInNano = endTime - startTime;
        long durationInMilli = durationInNano / 1_000_000;

        System.out.println("Execution time in nanoseconds: " + durationInNano);
        System.out.println("Execution time in milliseconds: " + durationInMilli);
    }

    // public static int fib(int n) {
    //     if(n == 0) return 0;
    //     if(n == 1) return 1;

    //     return fib(n - 1) + fib(n - 2);
    // }

    public static int fib(int n) {
        int n1 = 0;
        int n2 = 1;
        if(n == 0) return n1;
        if(n == 1) return n2;
        
        int sum = 0;

        for(int i = 1; i < n; i++) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        return sum;
    }
}