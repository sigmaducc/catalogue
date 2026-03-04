package striver.strings.easy;

import com.adnan.striver.strings.easy.RotateString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RotateStringTest {

    @Test
    void test1() {
        String s = "abcde";
        String goal = "cdeab";

        boolean result = new RotateString().rotateString(s, goal);

        assertTrue(result);
    }

    @Test
    void test2() {
        String s = "abcde";
        String goal = "abced";

        boolean result = new RotateString().rotateString(s, goal);

        assertFalse(result);
    }

    @Test
    void test3() {
        String s = "defdefdefabcabc";
        String goal = "defdefabcabcdef";

        boolean result = new RotateString().rotateString(s, goal);

        assertTrue(result);
    }

}