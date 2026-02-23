package striver.arrays.easy;

import com.adnan.striver.arrays.easy.LongestSubarrayWithSumK;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayWithSumKTest {

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        int output = 3;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int output = 4;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {-3, 2, 1};
        int k = 6;
        int output = 0;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {1, 2, 1, 0, 1};
        int k = 4;
        int output = 4;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {2, 3, 5};
        int k = 5;
        int output = 2;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        int[] nums = {-1, 1, 1};
        int k = 1;
        int output = 3;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test7() {
        int[] nums = {-50, 0, 52};
        int k = 2;
        int output = 3;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test8() {
        int[] nums = {1, 1, 1};
        int k = 4;
        int output = 0;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test9() {
        int[] nums = {-1, 0, 1, 1, -1, -1, 0};
        int k = 0;
        int output = 6;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test10() {
        int[] nums = {100000, -999812, -218};
        int k = 0;
        int expected = 0;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(expected, result);
    }

    @Test
    void test11() {
        int[] nums = {6, -2, 2, -8, 1, 7, 4, -10};
        int k = 0;
        int expected = 5;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(expected, result);
    }

    @Test
    void test12() {
        int[] nums = {6, -2, 2, -8, 1, 7, 4, -10};
        int k = 0;
        int expected = 8;

        int result = new LongestSubarrayWithSumK().longestSubarray(nums, k);

        assertEquals(expected, result);
    }

}