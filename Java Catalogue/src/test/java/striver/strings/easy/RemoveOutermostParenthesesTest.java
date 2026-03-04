package striver.strings.easy;

import com.adnan.striver.strings.easy.RemoveOutermostParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveOutermostParenthesesTest {

    @Test
    void test1() {
        String s = "(()())(())";
        String output = "()()()";

        String result = new RemoveOutermostParentheses().removeOuterParentheses(s);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = "(()())(())(()(()))";
        String output = "()()()()(())";

        String result = new RemoveOutermostParentheses().removeOuterParentheses(s);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String s = "()()";
        String output = "";

        String result = new RemoveOutermostParentheses().removeOuterParentheses(s);

        assertEquals(output, result);
    }

}