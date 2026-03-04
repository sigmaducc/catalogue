package striver.arrays.easy;

import com.adnan.striver.arrays.easy.LongestSubarrayWithSumKWithPositives;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubarrayWithSumKWithPositivesTest {

    @Test
    void test1() {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int output = 4;

        int result = new LongestSubarrayWithSumKWithPositives().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1, 3, 4, 7, 9};
        int k = 7;
        int output = 2;

        int result = new LongestSubarrayWithSumKWithPositives().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        int output = 3;

        int result = new LongestSubarrayWithSumKWithPositives().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {5, 2, 3, 1, 4};
        int k = 6;
        int output = 3;

        int result = new LongestSubarrayWithSumKWithPositives().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1};
        int k = 4;
        int output = 4;

        int result = new LongestSubarrayWithSumKWithPositives().longestSubarray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        int[] nums = {-3, 2, 1};
        int k = 6;
        int output = 0;

        int result = new LongestSubarrayWithSumKWithPositives().longestSubarray(nums, k);

        assertEquals(output, result);
    }

}