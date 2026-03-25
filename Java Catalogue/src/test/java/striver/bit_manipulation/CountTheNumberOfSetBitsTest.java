package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.CountTheNumberOfSetBits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheNumberOfSetBitsTest {

    private final CountTheNumberOfSetBits countTheNumberOfSetBits = new CountTheNumberOfSetBits();

    @Test
    void test1() {
        int n = 5;
        int output = 2;

        int result = countTheNumberOfSetBits.count(n);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int n = 15;
        int output = 4;

        int result = countTheNumberOfSetBits.count(n);

        assertEquals(output, result);
    }

}