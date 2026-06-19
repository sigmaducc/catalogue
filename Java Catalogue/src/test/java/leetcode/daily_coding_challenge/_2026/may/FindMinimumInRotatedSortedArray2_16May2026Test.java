package leetcode.daily_coding_challenge._2026.may;

import com.adnan.leetcode.daily_coding_challenge._2026.may.FindMinimumInRotatedSortedArray2_16May2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumInRotatedSortedArray2_16May2026Test {

    private final FindMinimumInRotatedSortedArray2_16May2026 findMinimumInRotatedSortedArray2 = new FindMinimumInRotatedSortedArray2_16May2026();

    @Test
    void test1() {
        int[] nums = {1,3,5};
        int output = 1;

        int result = findMinimumInRotatedSortedArray2.findMin(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {2,2,2,0,1};
        int output = 0;

        int result = findMinimumInRotatedSortedArray2.findMin(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {3,1,3};
        int output = 1;

        int result = findMinimumInRotatedSortedArray2.findMin(nums);

        assertEquals(output, result);
    }
}