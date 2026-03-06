package striver.arrays.medium;

import com.adnan.striver.arrays.medium.MaximumSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarrayTest {

    private final MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    void test1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int output = 6;

        int result = maximumSubarray.maxSubArray(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1};
        int output = 1;

        int result = maximumSubarray.maxSubArray(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {5,4,-1,7,8};
        int output = 23;

        int result = maximumSubarray.maxSubArray(nums);

        assertEquals(output, result);
    }

}