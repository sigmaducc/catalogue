package striver.basics.easy;

import com.adnan.striver.basics.easy.fibonacci.BaseFibonacciNumber;
import com.adnan.striver.basics.easy.fibonacci.IterativeFibonacciNumber;
import com.adnan.striver.basics.easy.fibonacci.RecursiveFibonacciNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumberTest {

    private void compareFib(BaseFibonacciNumber fibonacci, int n, int output) {
        int result = fibonacci.fib(n);

        assertEquals(output, result);
    }

    @Test
    void testRecursiveFibonacci1() {
        compareFib(new RecursiveFibonacciNumber(), 2, 1);
    }

    @Test
    void testRecursiveFibonacci2() {
        compareFib(new RecursiveFibonacciNumber(), 3, 2);
    }

    @Test
    void testRecursiveFibonacci3() {
        compareFib(new RecursiveFibonacciNumber(), 4, 3);
    }

    @Test
    void testIterativeFibonacci1() {
        compareFib(new IterativeFibonacciNumber(), 2, 1);
    }

    @Test
    void testIterativeFibonacci2() {
        compareFib(new IterativeFibonacciNumber(), 3, 2);
    }

    @Test
    void testIterativeFibonacci3() {
        compareFib(new IterativeFibonacciNumber(), 4, 3);
    }

}