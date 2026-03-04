package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.CountOccurrencesInSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountOccurrencesInSortedArrayTest {

    @Test
    void test1() {
        int[] nums = {2, 2 , 3 , 3 , 3 , 3 , 4};
        int target = 3;
        int output = 4;

        int result = new CountOccurrencesInSortedArray().count(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1, 1, 2, 2, 2, 2, 2, 3};
        int target = 2;
        int output = 5;

        int result = new CountOccurrencesInSortedArray().count(nums, target);

        assertEquals(output, result);
    }

}