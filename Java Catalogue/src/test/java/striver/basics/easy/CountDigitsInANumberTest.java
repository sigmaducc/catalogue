package striver.basics.easy;

import com.adnan.striver.basics.easy.CountDigitsInANumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDigitsInANumberTest {

    @Test
    void test1() {
        int n = 12345;
        int output = 5;

        int result = new CountDigitsInANumber().countDigits(n);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int n = 7789;
        int output = 4;

        int result = new CountDigitsInANumber().countDigits(n);

        assertEquals(output, result);
    }

}