package striver.arrays.medium;

import com.adnan.striver.arrays.medium.SubarraySumEqualsK;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarraySumEqualsKTest {

    @Test
    void test1() {
        int[] nums = {1,1,1};
        int k = 2;
        int output = 2;

        int result = new SubarraySumEqualsK().subarraySum(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1,2,3};
        int k = 3;
        int output = 2;

        int result = new SubarraySumEqualsK().subarraySum(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {3, -3, 1, 1, 1};
        int k = 3;
        int output = 3;

        int result = new SubarraySumEqualsK().subarraySum(nums, k);

        assertEquals(output, result);
    }

}