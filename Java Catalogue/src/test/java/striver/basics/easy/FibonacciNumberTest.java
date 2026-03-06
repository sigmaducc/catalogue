package striver.basics.easy;

import com.adnan.striver.basics.easy.fibonacci.BaseFibonacciNumber;
import com.adnan.striver.basics.easy.fibonacci.IterativeFibonacciNumber;
import com.adnan.striver.basics.easy.fibonacci.RecursiveFibonacciNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumberTest {

    private final IterativeFibonacciNumber iterativeFibonacciNumber = new IterativeFibonacciNumber();
    private final RecursiveFibonacciNumber recursiveFibonacciNumber = new RecursiveFibonacciNumber();

    private void compareFib(BaseFibonacciNumber fibonacci, int n, int output) {
        int result = fibonacci.fib(n);

        assertEquals(output, result);
    }

    @Test
    void testRecursiveFibonacci1() {
        compareFib(recursiveFibonacciNumber, 2, 1);
    }

    @Test
    void testRecursiveFibonacci2() {
        compareFib(recursiveFibonacciNumber, 3, 2);
    }

    @Test
    void testRecursiveFibonacci3() {
        compareFib(recursiveFibonacciNumber, 4, 3);
    }

    @Test
    void testIterativeFibonacci1() {
        compareFib(iterativeFibonacciNumber, 2, 1);
    }

    @Test
    void testIterativeFibonacci2() {
        compareFib(iterativeFibonacciNumber, 3, 2);
    }

    @Test
    void testIterativeFibonacci3() {
        compareFib(iterativeFibonacciNumber, 4, 3);
    }

}