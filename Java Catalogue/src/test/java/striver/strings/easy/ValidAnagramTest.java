package striver.strings.easy;

import com.adnan.striver.strings.easy.ValidAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {

    @Test
    void test1() {
        String s = "anagram";
        String t = "nagaram";

        boolean result = new ValidAnagram().isAnagram(s, t);

        assertTrue(result);
    }

    @Test
    void test2() {
        String s = "rat";
        String t = "car";

        boolean result = new ValidAnagram().isAnagram(s, t);

        assertFalse(result);
    }

}