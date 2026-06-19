package leetcode.daily_coding_challenge._2026.may;

import com.adnan.leetcode.daily_coding_challenge._2026.may.JumpGame3_17May2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JumpGame3_17May2026Test {

    private final JumpGame3_17May2026 jumpGame3 = new JumpGame3_17May2026();

    @Test
    void test1() {
        int[] nums = {4,2,3,0,3,1,2};
        int start = 5;

        boolean result = jumpGame3.canReach(nums, start);

        assertTrue(result);
    }

    @Test
    void test2() {
        int[] nums = {4,2,3,0,3,1,2};
        int start = 0;

        boolean result = jumpGame3.canReach(nums, start);

        assertTrue(result);
    }

    @Test
    void test3() {
        int[] nums = {3,0,2,1,2};
        int start = 2;

        boolean result = jumpGame3.canReach(nums, start);

        assertFalse(result);
    }

}