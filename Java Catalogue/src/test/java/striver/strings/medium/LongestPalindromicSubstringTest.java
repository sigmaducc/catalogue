package striver.strings.medium;

import com.adnan.striver.strings.medium.LongestPalindromicSubstring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {

    @Test
    void test1() {
        String s = "babad";
        String output = "bab";

        String result = new LongestPalindromicSubstring().longestPalindrome(s);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = "cbbd";
        String output = "bb";

        String result = new LongestPalindromicSubstring().longestPalindrome(s);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String s = "abb";
        String output = "bb";

        String result = new LongestPalindromicSubstring().longestPalindrome(s);

        assertEquals(output, result);
    }

}