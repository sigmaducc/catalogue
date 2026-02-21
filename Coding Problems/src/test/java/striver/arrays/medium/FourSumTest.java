package striver.arrays.medium;

import com.adnan.striver.arrays.medium.FourSum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class FourSumTest {

    @Test
    void test1() {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;

        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(-2,-1,1,2),
                List.of(-2,0,0,2),
                List.of(-1,0,0,1)
            )
        );

        List<List<Integer>> result = new FourSum().fourSum(nums, target);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {2,2,2,2,2};
        int target = 8;

        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(2,2,2,2)
            )
        );

        List<List<Integer>> result = new FourSum().fourSum(nums, target);

        assertIterableEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;

        List<List<Integer>> output = new ArrayList<>();

        List<List<Integer>> result = new FourSum().fourSum(nums, target);

        assertIterableEquals(output, result);
    }

}