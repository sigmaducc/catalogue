package striver.arrays.hard;

import com.adnan.striver.arrays.hard.MaximumProductSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductSubarrayTest {

    @Test
    void test1() {
        int[] nums = {2,3,-2,4};
        int output = 6;

        int result = new MaximumProductSubarray().maxProduct(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {-2,0,-1};
        int output = 0;

        int result = new MaximumProductSubarray().maxProduct(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {-2};
        int output = -2;

        int result = new MaximumProductSubarray().maxProduct(nums);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {0, 2};
        int output = 2;

        int result = new MaximumProductSubarray().maxProduct(nums);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {3,-1,4};
        int output = 4;

        int result = new MaximumProductSubarray().maxProduct(nums);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        int[] nums = {-3,-1,-1};
        int output = 3;

        int result = new MaximumProductSubarray().maxProduct(nums);

        assertEquals(output, result);
    }

    @Test
    void test7() {
        int[] nums = {-2,3,-4};
        int output = 24;

        int result = new MaximumProductSubarray().maxProduct(nums);

        assertEquals(output, result);
    }

    @Test
    void test8() {
        int[] nums = {2,-5,-2,-4,3};
        int output = 24;

        int result = new MaximumProductSubarray().maxProduct(nums);

        assertEquals(output, result);
    }

}