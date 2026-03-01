package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.FindPeakElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {

    @Test
    void test1() {
        int[] nums = {1,2,3,1};
        int output = 2;

        int result = new FindPeakElement().findPeakElement(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1,2,1,3,5,6,4};
        int output = 5;

        int result = new FindPeakElement().findPeakElement(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {-2147483648};
        int output = 0;

        int result = new FindPeakElement().findPeakElement(nums);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        // int min: -2147483648
        int[] nums = {-2147483648,-2147483647};
        int output = 1;

        int result = new FindPeakElement().findPeakElement(nums);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {6,5,4,3,2,3,2};
        int output = 0;

        int result = new FindPeakElement().findPeakElement(nums);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        int[] nums = {1,2};
        int output = 1;

        int result = new FindPeakElement().findPeakElement(nums);

        assertEquals(output, result);
    }

    @Test
    void test7() {
        int[] nums = {2,1};
        int output = 0;

        int result = new FindPeakElement().findPeakElement(nums);

        assertEquals(output, result);
    }

    @Test
    void test8() {
        int[] nums = {1};
        int output = 0;

        int result = new FindPeakElement().findPeakElement(nums);

        assertEquals(output, result);
    }

}