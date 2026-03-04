package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.SearchInsertPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {

    @Test
    void test1() {
        int[] nums = {1,3,5,6};
        int target = 5;
        int output = 2;

        int result = new SearchInsertPosition().searchInsert(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1,3,5,6};
        int target = 2;
        int output = 1;

        int result = new SearchInsertPosition().searchInsert(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {1,3,5,6};
        int target = 7;
        int output = 4;

        int result = new SearchInsertPosition().searchInsert(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {1,3,5,6};
        int target = 0;
        int output = 0;

        int result = new SearchInsertPosition().searchInsert(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {1,3};
        int target = 2;
        int output = 1;

        int result = new SearchInsertPosition().searchInsert(nums, target);

        assertEquals(output, result);
    }

}