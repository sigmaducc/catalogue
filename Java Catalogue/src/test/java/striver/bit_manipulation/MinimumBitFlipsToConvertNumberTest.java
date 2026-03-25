package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.MinimumBitFlipsToConvertNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumBitFlipsToConvertNumberTest {

    private final MinimumBitFlipsToConvertNumber minimumBitFlipsToConvertNumber = new MinimumBitFlipsToConvertNumber();

    @Test
    void test1() {
        int start = 10;
        int goal = 7;
        int output = 3;

        int result = minimumBitFlipsToConvertNumber.minBitFlips(start, goal);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int start = 3;
        int goal = 4;
        int output = 3;

        int result = minimumBitFlipsToConvertNumber.minBitFlips(start, goal);

        assertEquals(output, result);
    }

}