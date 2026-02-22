package striver.arrays.hard;

import com.adnan.striver.arrays.hard.MajorityElement2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class MajorityElement2Test {

    @Test
    void test1() {
        int[] nums = {3,2,3};
        List<Integer> output = new ArrayList<>(List.of(3));

        List<Integer> result = new MajorityElement2().majorityElement(nums);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1};
        List<Integer> output = new ArrayList<>(List.of(1));

        List<Integer> result = new MajorityElement2().majorityElement(nums);

        assertIterableEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {1,2};
        List<Integer> output = new ArrayList<>(List.of(1,2));

        List<Integer> result = new MajorityElement2().majorityElement(nums);

        assertIterableEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {2,2};
        List<Integer> output = new ArrayList<>(List.of(2));

        List<Integer> result = new MajorityElement2().majorityElement(nums);

        assertIterableEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {0,0,0};
        List<Integer> output = new ArrayList<>(List.of(0));

        List<Integer> result = new MajorityElement2().majorityElement(nums);

        assertIterableEquals(output, result);
    }

    @Test
    void test6() {
        int[] nums = {3,3,3,4,4,4,1,8};
        List<Integer> output = new ArrayList<>(List.of(3,4));

        List<Integer> result = new MajorityElement2().majorityElement(nums);

        assertIterableEquals(output, result);
    }

    @Test
    void test7() {
        int[] nums = {2,1,1,3,1,4,5,6};
        List<Integer> output = new ArrayList<>(List.of(1));

        List<Integer> result = new MajorityElement2().majorityElement(nums);

        assertIterableEquals(output, result);
    }

}