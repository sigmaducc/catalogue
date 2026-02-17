package striver.arrays.easy;

import com.adnan.striver.arrays.easy.TwoSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    void testTwoSum1() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = {0,1};

        int[] result = new TwoSum().twoSum(nums, target);

        Arrays.sort(output);
        Arrays.sort(result);

        assertArrayEquals(output, result);
    }

    @Test
    void testTwoSum2() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] output = {1,2};

        int[] result = new TwoSum().twoSum(nums, target);

        Arrays.sort(output);
        Arrays.sort(result);

        assertArrayEquals(output, result);
    }

    @Test
    void testTwoSum3() {
        int[] nums = {3,3};
        int target = 6;
        int[] output = {0,1};

        int[] result = new TwoSum().twoSum(nums, target);

        Arrays.sort(output);
        Arrays.sort(result);

        assertArrayEquals(output, result);
    }

}