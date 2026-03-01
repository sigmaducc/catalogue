package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.FindFirstAndLastPositionOfElementInSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    void test1() {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] output = {3, 4};

        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] output = {-1, -1};

        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {};
        int target = 0;
        int[] output = {-1, -1};

        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {};
        int target = 42;
        int[] output = {-1, -1};

        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {7,8,8,8,8,8,8,8,8,8,8,9};
        int target = 7;
        int[] output = {0, 0};

        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(output, result);
    }

    @Test
    void test6() {
        int[] nums = {7,8,8,8,8,8,8,8,8,8,8,9};
        int target = 8;
        int[] output = {1, 10};

        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(output, result);
    }

    @Test
    void test7() {
        int[] nums = {7,8,8,8,8,8,8,8,8,8,8,9};
        int target = 10;
        int[] output = {-1, -1};

        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(output, result);
    }

    @Test
    void test8() {
        int[] nums = {1,2,2,2,2,3,4,5,5,5,5,6,7,8,9,10,11,12,12,12,12,12,13};
        int target = 2;
        int[] output = {1, 4};

        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(output, result);
    }

    @Test
    void test9() {
        int[] nums = {-999985131,-999953607,-999953607,-999915742,-999883817,-999849817,-999822901,-999815377,-999810801,-68594,-49967,20394,114012,999969829,999973689,999975494};
        int target = -999953607;
        int[] output = {1, 2};

        int[] result = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);

        assertArrayEquals(output, result);
    }

}