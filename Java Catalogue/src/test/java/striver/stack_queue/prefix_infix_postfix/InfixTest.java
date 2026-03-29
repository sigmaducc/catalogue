package striver.stack_queue.prefix_infix_postfix;

import com.adnan.striver.stack_queue.prefix_infix_postfix.Infix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InfixTest {

    private final Infix infix = new Infix();

    @Test
    void testConversionToPostfix1() {
        String s = "a + b * (c^d - e) ^ (f + g * h) - i";
        String output = "abcd^e-fgh*+^*+i-";

        String result = infix.convertToPostfix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToPostfix2() {
        String s = "a + b * (c ^ d - e)";
        String output = "abcd^e-*+";

        String result = infix.convertToPostfix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToPostfix3() {
        String s = "(p + q) * (m - n)";
        String output = "pq+mn-*";

        String result = infix.convertToPostfix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToPostfix4() {
        String s = "a ^ b ^ c";
        String output = "abc^^";

        String result = infix.convertToPostfix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToPostfix5() {
        String s = "a ^ b * c";
        String output = "ab^c*";

        String result = infix.convertToPostfix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToPrefix1() {
        String s = "x + ((y * z) / w) + u";
        String output = "++x/*yzwu";

        String result = infix.convertToPrefix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToPrefix2() {
        String s = "a + b";
        String output = "+ab";

        String result = infix.convertToPrefix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToPrefix3() {
        String s = "a ^ b ^ c";
        String output = "^a^bc";

        String result = infix.convertToPrefix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToPrefix4() {
        String s = "a ^ b * c";
        String output = "*^abc";

        String result = infix.convertToPrefix(s);

        assertEquals(output, result);
    }

}