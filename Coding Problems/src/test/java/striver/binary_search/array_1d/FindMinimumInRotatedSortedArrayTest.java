package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.FindMinimumInRotatedSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    void test1() {
        int[] nums = {3,4,5,1,2};
        int output = 1;

        int result = new FindMinimumInRotatedSortedArray().findMin(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {4,5,6,7,0,1,2};
        int output = 0;

        int result = new FindMinimumInRotatedSortedArray().findMin(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {11,13,15,17};
        int output = 11;

        int result = new FindMinimumInRotatedSortedArray().findMin(nums);

        assertEquals(output, result);
    }

}