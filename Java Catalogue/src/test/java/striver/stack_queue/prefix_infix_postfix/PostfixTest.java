package striver.stack_queue.prefix_infix_postfix;

import com.adnan.striver.stack_queue.prefix_infix_postfix.Postfix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostfixTest {

    private final Postfix postfix = new Postfix();

    @Test
    void testConvertToInfix1() {
        String s = "ab+c*";
        String output = "((a+b)*c)";

        String result = postfix.convertToInfix(s);

        assertEquals(output, result);
    }

    @Test
    void testConvertToInfix2() {
        String s = "ab*cd/+";
        String output = "((a*b)+(c/d))";

        String result = postfix.convertToInfix(s);

        assertEquals(output, result);
    }

    @Test
    void testConvertToPrefix1() {
        String s = "ab+";
        String output = "+ab";

        String result = postfix.convertToPrefix(s);

        assertEquals(output, result);
    }

    @Test
    void testConvertToPrefix2() {
        String s = "abc*+d-";
        String output = "-+a*bcd";

        String result = postfix.convertToPrefix(s);

        assertEquals(output, result);
    }

}