package striver.basics.easy;

import com.adnan.striver.basics.easy.ReverseInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    @Test
    void testReverseInteger1() {
        int num = 123;
        int result = new ReverseInteger().reverse(num);
        int output = 321;

        assertEquals(output, result);
    }

    @Test
    void testReverseInteger2() {
        int num = -123;
        int result = new ReverseInteger().reverse(num);
        int output = -321;

        assertEquals(output, result);
    }

    @Test
    void testReverseInteger3() {
        int num = 120;
        int result = new ReverseInteger().reverse(num);
        int output = 21;

        assertEquals(output, result);
    }
}