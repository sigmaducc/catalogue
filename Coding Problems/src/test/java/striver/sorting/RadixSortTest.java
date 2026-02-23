package striver.sorting;

import com.adnan.striver.sorting2.RadixSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RadixSortTest {

    @Test
    void test1() {
        int[] nums = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] output = {2, 24, 45, 66, 75, 90, 170, 802};

        new RadixSort().radixSort(nums);

        assertArrayEquals(output, nums);
    }

    @Test
    void test2() {
        int[] nums = {170, 45, 75, 90};
        int[] output = {45, 75, 90, 170};

        new RadixSort().radixSort(nums);

        assertArrayEquals(output, nums);
    }

    @Test
    void test3() {
        int[] nums = {123, 432, 689, 89, 10, 21};
        int[] output = {10, 21, 89, 123, 432, 689};

        new RadixSort().radixSort(nums);

        assertArrayEquals(output, nums);
    }

    @Test
    void test4() {
        int max = (int) 1e7;
        int[] nums = new int[max+1];
        int[] output = new int[max+1];

        int i = 0;
        while(i <= max) {
            nums[i] = max - i;
            output[i] = i;
            i++;
        }

        new RadixSort().radixSort(nums);

        assertArrayEquals(output, nums);
    }

}