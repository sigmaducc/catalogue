package leetcode.daily_coding_challenge._2026.may;

import com.adnan.leetcode.daily_coding_challenge._2026.may.MaximumNumberOfJumpsToReachTheLastIndex_10May2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfJumpsToReachTheLastIndex_10May2026Test {

    private final MaximumNumberOfJumpsToReachTheLastIndex_10May2026 maximumNumberOfJumpsToReachTheLastIndex = new MaximumNumberOfJumpsToReachTheLastIndex_10May2026();

    @Test
    void test1() {
        int[] nums = {1,3,6,4,1,2};
        int target = 2;
        int output = 3;

        int result = maximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1,3,6,4,1,2};
        int target = 3;
        int output = 5;

        int result = maximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {1,3,6,4,1,2};
        int target = 0;
        int output = -1;

        int result = maximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {0,1};
        int target = 1;
        int output = 1;

        int result = maximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {1,0,2};
        int target = 1;
        int output = 1;

        int result = maximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        int[] nums = {1,0};
        int target = 1;
        int output = 1;

        int result = maximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test7() {
        int[] nums = {1,0,2};
        int target = 2;
        int output = 2;

        int result = maximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target);

        assertEquals(output, result);
    }

}