package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.FindXorFromLToR;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindXorFromLToRTest {

    private final FindXorFromLToR findXorFromLToR = new FindXorFromLToR();

    @Test
    void test1() {
        int l = 3;
        int r = 5;
        int output = 2;

        int result = findXorFromLToR.xor(l, r);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int l = 1;
        int r = 3;
        int output = 0;

        int result = findXorFromLToR.xor(l, r);

        assertEquals(output, result);
    }

}