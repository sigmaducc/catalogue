package leetcode.daily_coding_challenge._2026.may;

import com.adnan.leetcode.daily_coding_challenge._2026.may.FindThePrefixCommonArrayOfTwoArrays_20May2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindThePrefixCommonArrayOfTwoArrays_20May2026Test {

    private final FindThePrefixCommonArrayOfTwoArrays_20May2026 findThePrefixCommonArrayOfTwoArrays = new FindThePrefixCommonArrayOfTwoArrays_20May2026();

    @Test
    void test1() {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        int[] output = {0,2,3,4};

        int[] result = findThePrefixCommonArrayOfTwoArrays.findThePrefixCommonArray(A, B);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] A = {2,3,1};
        int[] B = {3,1,2};
        int[] output = {0,1,3};

        int[] result = findThePrefixCommonArrayOfTwoArrays.findThePrefixCommonArray(A, B);

        assertArrayEquals(output, result);
    }

}