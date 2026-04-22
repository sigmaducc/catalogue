package striver.sliding_window_and_two_pointers;

import com.adnan.striver.sliding_window_and_two_pointers.LongestRepeatingCharacterReplacement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestRepeatingCharacterReplacementTest {

    private final LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();

    @Test
    void test1() {
        String s = "ABAB";
        int k = 2;
        int output = 4;

        int result = longestRepeatingCharacterReplacement.characterReplacement(s, k);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = "AABABBA";
        int k = 1;
        int output = 4;

        int result = longestRepeatingCharacterReplacement.characterReplacement(s, k);

        assertEquals(output, result);
    }

}