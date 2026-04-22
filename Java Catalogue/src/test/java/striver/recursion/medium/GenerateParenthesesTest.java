package striver.recursion.medium;

import com.adnan.striver.recursion.medium.GenerateParentheses;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class GenerateParenthesesTest {

    private final GenerateParentheses generateParentheses = new GenerateParentheses();

    @Test
    void test1() {
        int n = 3;
        List<String> output = new ArrayList<>(
            List.of(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"
            )
        );

        List<String> result = generateParentheses.generateParenthesis(n);

        Collections.sort(output);
        Collections.sort(result);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        int n = 2;
        List<String> output = new ArrayList<>(
            List.of(
                "()()",
                "(())"
            )
        );

        List<String> result = generateParentheses.generateParenthesis(n);

        Collections.sort(output);
        Collections.sort(result);

        assertIterableEquals(output, result);
    }

    @Test
    void test3() {
        int n = 1;
        List<String> output = new ArrayList<>(
            List.of(
                "()"
            )
        );

        List<String> result = generateParentheses.generateParenthesis(n);

        Collections.sort(output);
        Collections.sort(result);

        assertIterableEquals(output, result);
    }

}