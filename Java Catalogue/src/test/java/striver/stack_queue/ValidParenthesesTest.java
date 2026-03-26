package striver.stack_queue;

import com.adnan.striver.stack_queue.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void test1() {
        String s = "()";

        boolean result = validParentheses.isValid(s);

        assertTrue(result);
    }

    @Test
    void test2() {
        String s = "()[]{}";

        boolean result = validParentheses.isValid(s);

        assertTrue(result);
    }

    @Test
    void test3() {
        String s = "(]";

        boolean result = validParentheses.isValid(s);

        assertFalse(result);
    }

    @Test
    void test4() {
        String s = "([])";

        boolean result = validParentheses.isValid(s);

        assertTrue(result);
    }

    @Test
    void test5() {
        String s = "([)]";

        boolean result = validParentheses.isValid(s);

        assertFalse(result);
    }

}