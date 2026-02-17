package striver.arrays.easy;

import com.adnan.striver.arrays.easy.RotateArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayTest {

    @Test
    void testRotateArray1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] output = {5, 6, 7, 1, 2, 3, 4};
        int k = 3;

        new RotateArray().rotate(nums, k);

        assertArrayEquals(nums, output);
    }

    @Test
    void testRotateArray2() {
        int[] nums = {-1,-100,3,99};
        int[] output = {3,99,-1,-100};
        int k = 2;

        new RotateArray().rotate(nums, k);

        assertArrayEquals(nums, output);
    }

    @Test
    void testRotateArray3() {
        int[] nums = {1,2,3,4,5,6};
        int[] output = {6,1,2,3,4,5};
        int k = 1;

        new RotateArray().rotate(nums, k);

        assertArrayEquals(nums, output);
    }

}