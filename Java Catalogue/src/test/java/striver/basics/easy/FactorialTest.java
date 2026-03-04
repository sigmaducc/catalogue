package striver.basics.easy;

import com.adnan.striver.basics.easy.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void test1() {
        int n = 5;
        long output = 120L;

        long result = new Factorial().factorial(n);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int n = 3;
        long output = 6L;

        long result = new Factorial().factorial(n);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int n = 10;
        long output = 3_628_800L;

        long result = new Factorial().factorial(n);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int n = 18;
        long output = 6_402_373_705_728_000L;

        long result = new Factorial().factorial(n);

        assertEquals(output, result);
    }

}