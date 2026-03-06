package striver.strings.easy;

import com.adnan.striver.strings.easy.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void test1() {
        String[] strs = {"flower","flow","flight"};
        String output = "fl";

        String result = longestCommonPrefix.longestCommonPrefix(strs);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String[] strs = {"dog","racecar","car"};
        String output = "";

        String result = longestCommonPrefix.longestCommonPrefix(strs);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String[] strs = {"cir","car"};
        String output = "c";

        String result = longestCommonPrefix.longestCommonPrefix(strs);

        assertEquals(output, result);
    }

}