package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.SetTheRightmostBit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTheRightmostBitTest {

    private final SetTheRightmostBit setTheRightmostBit = new SetTheRightmostBit();

    @Test
    void test1() {
        int n = 10;
        int output = 11;

        int result = setTheRightmostBit.set(n);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int n = 7;
        int output = 15;

        int result = setTheRightmostBit.set(n);

        assertEquals(output, result);
    }

}