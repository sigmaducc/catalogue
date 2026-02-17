package striver.strings.easy;

import com.adnan.striver.strings.easy.IsomorphicStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsomorphicStringsTest {

    @Test
    void test1() {
        String s = "egg";
        String t = "add";

        boolean result = new IsomorphicStrings().isIsomorphic(s, t);

        assertTrue(result);
    }

    @Test
    void test2() {
        String s = "paper";
        String t = "title";

        boolean result = new IsomorphicStrings().isIsomorphic(s, t);

        assertTrue(result);
    }

    @Test
    void test3() {
        String s = "f11";
        String t = "b23";

        boolean result = new IsomorphicStrings().isIsomorphic(s, t);

        assertFalse(result);
    }

    @Test
    void test4() {
        String s = "badc";
        String t = "baba";

        boolean result = new IsomorphicStrings().isIsomorphic(s, t);

        assertFalse(result);
    }

    @Test
    void test5() {
        String s = "bbbaaaba";
        String t = "aaabbbba";

        boolean result = new IsomorphicStrings().isIsomorphic(s, t);

        assertFalse(result);
    }

}