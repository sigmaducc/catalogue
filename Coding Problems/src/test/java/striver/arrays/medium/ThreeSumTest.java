package striver.arrays.medium;

import com.adnan.striver.arrays.medium.ThreeSum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ThreeSumTest {

    @Test
    void test1() {
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> output = new ArrayList<>(List.of(
            List.of(-1,-1,2),
            List.of(-1,0,1)
        ));

        List<List<Integer>> result = new ThreeSum().threeSum(nums);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {0,1,1};

        List<List<Integer>> output = new ArrayList<>();

        List<List<Integer>> result = new ThreeSum().threeSum(nums);

        assertIterableEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {0,0,0};

        List<List<Integer>> output = new ArrayList<>(List.of(
            List.of(0,0,0)
        ));

        List<List<Integer>> result = new ThreeSum().threeSum(nums);

        assertIterableEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {-100,-70,-60,110,120,130,160};

        List<List<Integer>> output = new ArrayList<>(List.of(
            List.of(-100,-60,160),
            List.of(-70,-60,130)
        ));

        output.sort(Comparator.comparing(list -> list.get(0)));

        List<List<Integer>> result = new ThreeSum().threeSum(nums);
        result.sort(Comparator.comparing(list -> list.get(0)));

        assertIterableEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {-1,0,1,0};

        List<List<Integer>> output = new ArrayList<>(List.of(
                List.of(-1,0,1)
        ));

        List<List<Integer>> result = new ThreeSum().threeSum(nums);

        assertIterableEquals(output, result);
    }

}