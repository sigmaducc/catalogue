package leetcode.daily_coding_challenge._2026.may;

import com.adnan.leetcode.daily_coding_challenge._2026.may.FindMinimumInRotatedSortedArray_15May2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumInRotatedSortedArray_15May2026Test {

    private final FindMinimumInRotatedSortedArray_15May2026 findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray_15May2026();

    @Test
    void test1() {
        int[] nums = {3,4,5,1,2};
        int output = 1;

        int result = findMinimumInRotatedSortedArray.findMin(nums);
        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {4,5,6,7,0,1,2};
        int output = 0;

        int result = findMinimumInRotatedSortedArray.findMin(nums);
        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {11,13,15,17};
        int output = 11;

        int result = findMinimumInRotatedSortedArray.findMin(nums);
        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {3,1,2};
        int output = 1;

        int result = findMinimumInRotatedSortedArray.findMin(nums);
        assertEquals(output, result);
    }

}