package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.PowerOfTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerOfTwoTest {

    private final PowerOfTwo powerOfTwo = new PowerOfTwo();

    @Test
    void test1() {
        int n = 16;

        boolean result = powerOfTwo.isPowerOfTwo(n);

        assertTrue(result);
    }

    @Test
    void test2() {
        int n = 3;

        boolean result = powerOfTwo.isPowerOfTwo(n);

        assertFalse(result);
    }

}