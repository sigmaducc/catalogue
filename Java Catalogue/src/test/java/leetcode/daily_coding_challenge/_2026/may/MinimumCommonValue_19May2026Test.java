package leetcode.daily_coding_challenge._2026.may;

import com.adnan.leetcode.daily_coding_challenge._2026.may.MinimumCommonValue_19May2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumCommonValue_19May2026Test {

    private final MinimumCommonValue_19May2026 minimumCommonValue = new MinimumCommonValue_19May2026();

    @Test
    void test1() {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};

        int output = 2;

        int result = minimumCommonValue.getCommon(nums1, nums2);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums1 = {1,2,3,6};
        int[] nums2 = {2,3,4,5};

        int output = 2;

        int result = minimumCommonValue.getCommon(nums1, nums2);

        assertEquals(output, result);
    }

}