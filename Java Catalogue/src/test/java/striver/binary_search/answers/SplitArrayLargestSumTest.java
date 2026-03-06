package striver.binary_search.answers;

import com.adnan.striver.binary_search.answers.SplitArrayLargestSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitArrayLargestSumTest {

    private final SplitArrayLargestSum splitArrayLargestSum = new SplitArrayLargestSum();

    @Test
    void test1() {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int output = 18;

        int result = splitArrayLargestSum.splitArray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        int output = 9;

        int result = splitArrayLargestSum.splitArray(nums, k);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {1,4,4};
        int k = 3;
        int output = 4;

        int result = splitArrayLargestSum.splitArray(nums, k);

        assertEquals(output, result);
    }

}