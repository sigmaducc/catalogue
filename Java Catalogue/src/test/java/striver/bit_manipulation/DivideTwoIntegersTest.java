package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.DivideTwoIntegers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideTwoIntegersTest {
    private final DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();

    @Test
    void test1() {
        int dividend = 10;
        int divisor = 3;
        int output = 3;

        int result = divideTwoIntegers.divide(dividend, divisor);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int dividend = 7;
        int divisor = -3;
        int output = -2;

        int result = divideTwoIntegers.divide(dividend, divisor);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int dividend = -1;
        int divisor = 1;
        int output = -1;

        int result = divideTwoIntegers.divide(dividend, divisor);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int dividend = -2147483648;
        int divisor = -1;
        int output = 2147483647;

        int result = divideTwoIntegers.divide(dividend, divisor);

        assertEquals(output, result);
    }

}