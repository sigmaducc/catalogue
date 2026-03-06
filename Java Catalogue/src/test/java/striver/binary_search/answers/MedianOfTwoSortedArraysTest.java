package striver.binary_search.answers;

import com.adnan.striver.binary_search.answers.MedianOfTwoSortedArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {

    private final MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    void test1() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double output = 2.0;

        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double output = 2.5;

        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums1 = {1,3,4,8,10};
        int[] nums2 = {4,7,10,12,15,20,22};
        double output = 9;

        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums1 = {1,4,6,10,20};
        int[] nums2 = {7,8,20,40,80};
        double output = 9;

        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums1 = {2};
        int[] nums2 = {};
        double output = 2;

        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {6,7,8,9,10,11,12,13,14,15,16,17};
        double output = 9;

        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2);

        assertEquals(output, result);
    }

}