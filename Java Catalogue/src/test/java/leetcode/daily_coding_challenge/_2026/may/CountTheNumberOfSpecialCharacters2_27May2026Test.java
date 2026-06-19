package leetcode.daily_coding_challenge._2026.may;

import com.adnan.leetcode.daily_coding_challenge._2026.may.CountTheNumberOfSpecialCharacters2_27May2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTheNumberOfSpecialCharacters2_27May2026Test {

    private final CountTheNumberOfSpecialCharacters2_27May2026 countTheNumberOfSpecialCharacters2 = new CountTheNumberOfSpecialCharacters2_27May2026();

    @Test
    void test1() {
        String word = "aaAbcBC";
        int output = 3;

        int result = countTheNumberOfSpecialCharacters2.numberOfSpecialChars(word);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String word = "abc";
        int output = 0;

        int result = countTheNumberOfSpecialCharacters2.numberOfSpecialChars(word);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String word = "AbBCab";
        int output = 0;

        int result = countTheNumberOfSpecialCharacters2.numberOfSpecialChars(word);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        String word = "cCceDC";
        int output = 0;

        int result = countTheNumberOfSpecialCharacters2.numberOfSpecialChars(word);

        assertEquals(output, result);
    }

}