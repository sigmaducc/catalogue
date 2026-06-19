package leetcode.daily_coding_challenge._2026.may;

import com.adnan.leetcode.daily_coding_challenge._2026.may.SeparateTheDigitsInAnArray_11May2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SeparateTheDigitsInAnArray_11May2026Test {

    private final SeparateTheDigitsInAnArray_11May2026 separateTheDigitsInAnArray = new SeparateTheDigitsInAnArray_11May2026();

    @Test
    void test1() {
        int[] nums = {13,25,83,77};
        int[] output = {1,3,2,5,8,3,7,7};

        int[] result = separateTheDigitsInAnArray.separateDigits(nums);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {7,1,3,9};
        int[] output = {7,1,3,9};

        int[] result = separateTheDigitsInAnArray.separateDigits(nums);

        assertArrayEquals(output, result);
    }
}