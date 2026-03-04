package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.SearchInRotatedSortedArray2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchInRotatedSortedArray2Test {

    @Test
    void test1() {
        int[] nums = {2,2,2,5,6,0,0,1,2,2,2,2};
        int target = 0;

        boolean result = new SearchInRotatedSortedArray2().search(nums, target);

        assertTrue(result);
    }

    @Test
    void test2() {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;

        boolean result = new SearchInRotatedSortedArray2().search(nums, target);

        assertFalse(result);
    }

    @Test
    void test3() {
        int[] nums = {1,0,1,1,1};
        int target = 0;

        boolean result = new SearchInRotatedSortedArray2().search(nums, target);

        assertTrue(result);
    }

    @Test
    void test4() {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;

        boolean result = new SearchInRotatedSortedArray2().search(nums, target);

        assertTrue(result);
    }

    @Test
    void test5() {
        int[] nums = {1};
        int target = 0;

        boolean result = new SearchInRotatedSortedArray2().search(nums, target);

        assertFalse(result);
    }

}