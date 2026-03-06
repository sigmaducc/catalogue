package striver.strings.medium;

import com.adnan.striver.strings.medium.MaximumNestingDepthOfTheParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNestingDepthOfTheParenthesesTest {

    private final MaximumNestingDepthOfTheParentheses maximumNestingDepthOfTheParentheses = new MaximumNestingDepthOfTheParentheses();

    @Test
    void test1() {
        String s = "(1+(2*3)+((8)/4))+1";
        int output = 3;

        int result = maximumNestingDepthOfTheParentheses.maxDepth(s);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = "(1)+((2))+(((3)))";
        int output = 3;

        int result = maximumNestingDepthOfTheParentheses.maxDepth(s);

        assertEquals(output, result);
    }

}