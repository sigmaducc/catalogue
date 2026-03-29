package striver.stack_queue.prefix_infix_postfix;

import com.adnan.striver.stack_queue.prefix_infix_postfix.Prefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrefixTest {

    private final Prefix prefix = new Prefix();

    @Test
    void testConversionToInfix1() {
        String s = "+ab";
        String output = "(a+b)";

        String result = prefix.convertToInfix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToInfix2() {
        String s = "*+ab-cd";
        String output = "((a+b)*(c-d))";

        String result = prefix.convertToInfix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToPostfix1() {
        String s = "+ab";
        String output = "ab+";

        String result = prefix.convertToPostfix(s);

        assertEquals(output, result);
    }

    @Test
    void testConversionToPostfix2() {
        String s = "*+ab-cd";
        String output = "ab+cd-*";

        String result = prefix.convertToPostfix(s);

        assertEquals(output, result);
    }

}