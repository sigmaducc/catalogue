package striver.arrays.medium;

import com.adnan.striver.arrays.medium.LeadersInAnArray;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeadersInAnArrayTest {

    @Test
    void test1() {
        int[] nums = {1, 2, 5, 3, 1, 2};
        List<Integer> output = new ArrayList<>(Arrays.asList(5, 3, 2));

        List<Integer> result = new LeadersInAnArray().leaders(nums);

        assertArrayEquals(output.toArray(), result.toArray());
    }

    @Test
    void test2() {
        int[] nums = {-3, 4, 5, 1, -4, -5};
        List<Integer> output = new ArrayList<>(Arrays.asList(5, 1, -4, -5));

        List<Integer> result = new LeadersInAnArray().leaders(nums);

        assertArrayEquals(output.toArray(), result.toArray());
    }

    @Test
    void test3() {
        int[] nums = {-3, 4, 5, 1, -30, -10};
        List<Integer> output = new ArrayList<>(Arrays.asList(5, 1, -10));

        List<Integer> result = new LeadersInAnArray().leaders(nums);

        assertArrayEquals(output.toArray(), result.toArray());
    }

    @Test
    void test4() {
        int[] nums = {1, 2, 5, 3, 1, 4};
        List<Integer> output = new ArrayList<>(Arrays.asList(5, 4));

        List<Integer> result = new LeadersInAnArray().leaders(nums);

        assertArrayEquals(output.toArray(), result.toArray());
    }

}