package leetcode.daily_coding_challenge._2026.may;

import com.adnan.leetcode.daily_coding_challenge._2026.may.CheckIfArrayIsGood_14May2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfArrayIsGood_14May2026Test {

    private final CheckIfArrayIsGood_14May2026 checkIfArrayIsGood = new CheckIfArrayIsGood_14May2026();

    @Test
    void test1() {
        int[] nums = {2, 1, 3};

        boolean result = checkIfArrayIsGood.isGood(nums);

        assertFalse(result);
    }

    @Test
    void test2() {
        int[] nums = {1, 3, 3, 2};

        boolean result = checkIfArrayIsGood.isGood(nums);

        assertTrue(result);
    }

    @Test
    void test3() {
        int[] nums = {1, 1};

        boolean result = checkIfArrayIsGood.isGood(nums);

        assertTrue(result);
    }

    @Test
    void test4() {
        int[] nums = {3, 4, 4, 1, 2, 1};

        boolean result = checkIfArrayIsGood.isGood(nums);

        assertFalse(result);
    }

    @Test
    void test5() {
        int[] nums = {9, 9};

        boolean result = checkIfArrayIsGood.isGood(nums);

        assertFalse(result);
    }
}