package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void test1() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int output = 4;

        int result = binarySearch.search(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        int output = -1;

        int result = binarySearch.search(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {5};
        int target = 5;
        int output = 0;

        int result = binarySearch.search(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {2, 5};
        int target = 5;
        int output = 1;

        int result = binarySearch.search(nums, target);

        assertEquals(output, result);
    }

}