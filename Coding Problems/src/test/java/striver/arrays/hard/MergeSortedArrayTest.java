package striver.arrays.hard;

import com.adnan.striver.arrays.hard.MergeSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArrayTest {

    @Test
    void test1() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        int[] output = {1,2,2,3,5,6};

        new MergeSortedArray().merge(nums1, m, nums2, n);

        assertArrayEquals(output, nums1);
    }

    @Test
    void test2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        int[] output = {1};

        new MergeSortedArray().merge(nums1, m, nums2, n);

        assertArrayEquals(output, nums1);
    }

    @Test
    void test3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        int[] output = {1};

        new MergeSortedArray().merge(nums1, m, nums2, n);

        assertArrayEquals(output, nums1);
    }

    @Test
    void test4() {
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        int[] output = {1, 2, 3, 4, 5, 6};

        new MergeSortedArray().merge(nums1, m, nums2, n);

        assertArrayEquals(output, nums1);
    }

    @Test
    void test5() {
        int[] nums1 = {1, 2, 3,0,0,0};
        int m = 3;
        int[] nums2 = {4, 5, 6};
        int n = 3;

        int[] output = {1, 2, 3, 4, 5, 6};

        new MergeSortedArray().merge(nums1, m, nums2, n);

        assertArrayEquals(output, nums1);
    }

    @Test
    void test6() {
        int[] nums1 = {2,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,2,3};
        int n = 3;

        int[] output = {2,2,2,2,3,3};

        new MergeSortedArray().merge(nums1, m, nums2, n);

        assertArrayEquals(output, nums1);
    }

    @Test
    void test7() {
        int[] nums1 = {0,0,0,0,0};
        int m = 0;
        int[] nums2 = {1, 2, 3, 4, 5};
        int n = 5;

        int[] output = {1, 2, 3, 4, 5};

        new MergeSortedArray().merge(nums1, m, nums2, n);

        assertArrayEquals(output, nums1);
    }

    @Test
    void test8() {
        int[] nums1 = {4,0,0,0,0,0};
        int m = 1;
        int[] nums2 = {1, 2, 3, 5, 6};
        int n = 5;

        int[] output = {1, 2, 3, 4, 5, 6};

        new MergeSortedArray().merge(nums1, m, nums2, n);

        assertArrayEquals(output, nums1);
    }

}