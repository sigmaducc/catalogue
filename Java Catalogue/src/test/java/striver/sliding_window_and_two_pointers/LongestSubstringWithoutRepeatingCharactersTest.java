package striver.sliding_window_and_two_pointers;

import com.adnan.striver.sliding_window_and_two_pointers.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    void test1() {
        String s = "abcabcbb";
        int output = 3;

        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = "bbbbb";
        int output = 1;

        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String s = "pwwkew";
        int output = 3;

        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        String s = "dvdf";
        int output = 3;

        int result = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        assertEquals(output, result);
    }

}