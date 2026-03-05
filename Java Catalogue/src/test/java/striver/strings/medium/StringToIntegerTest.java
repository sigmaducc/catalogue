package striver.strings.medium;

import com.adnan.striver.strings.medium.StringToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringToIntegerTest {

    @Test
    void test1() {
        String s = "42";
        int output = 42;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = " -042";
        int output = -42;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String s = "1337c0d3";
        int output = 1337;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        String s = "0-1";
        int output = 0;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        String s = "words and 987";
        int output = 0;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        String s = "-91283472332";
        int output = -2147483648;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test7() {
        String s = "";
        int output = 0;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test8() {
        String s = "+1";
        int output = 1;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test9() {
        String s = "21474836460";
        int output = 2147483647;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test10() {
        String s = " ";
        int output = 0;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test11() {
        String s = "-2147483647";
        int output = -2147483647;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

    @Test
    void test12() {
        String s = "20000000000000000000";
        int output = 2147483647;

        int result = new StringToInteger().myAtoi(s);

        assertEquals(output, result);
    }

}