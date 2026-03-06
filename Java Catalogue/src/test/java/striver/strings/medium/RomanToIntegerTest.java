package striver.strings.medium;

import com.adnan.striver.strings.medium.RomanToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void test1() {
        String s = "III";
        int output = 3;

        int result = romanToInteger.romanToInt(s);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = "LVIII";
        int output = 58;

        int result = romanToInteger.romanToInt(s);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String s = "II";
        int output = 2;

        int result = romanToInteger.romanToInt(s);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        String s = "XII";
        int output = 12;

        int result = romanToInteger.romanToInt(s);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        String s = "XXVII";
        int output = 27;

        int result = romanToInteger.romanToInt(s);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        String s = "IV";
        int output = 4;

        int result = romanToInteger.romanToInt(s);

        assertEquals(output, result);
    }

    @Test
    void test7() {
        String s = "IX";
        int output = 9;

        int result = romanToInteger.romanToInt(s);

        assertEquals(output, result);
    }

    @Test
    void test8() {
        String s = "MCMXCIV";
        int output = 1994;

        int result = romanToInteger.romanToInt(s);

        assertEquals(output, result);
    }

}