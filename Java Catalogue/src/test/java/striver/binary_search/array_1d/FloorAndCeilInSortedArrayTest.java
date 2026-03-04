package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.FloorAndCeilInSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FloorAndCeilInSortedArrayTest {

    @Test
    void test1() {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 5;
        int[] output = {4, 7};

        int[] result = new FloorAndCeilInSortedArray().search(nums, x);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {3, 4, 4, 7, 8, 10};
        int x = 8;
        int[] output = {8, 8};

        int[] result = new FloorAndCeilInSortedArray().search(nums, x);

        assertArrayEquals(output, result);
    }

}