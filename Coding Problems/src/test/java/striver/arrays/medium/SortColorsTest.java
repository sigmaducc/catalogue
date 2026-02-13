package striver.arrays.medium;

import com.adnan.striver.arrays.medium.SortColors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorsTest {

    @Test
    void testSortColors1() {
        int[] nums = {2,0,2,1,1,0};
        int[] expected = {0,0,1,1,2,2};

        new SortColors().sortColors(nums);

        assertArrayEquals(nums, expected);
    }

    @Test
    void testSortColors2() {
        int[] nums = {2,0,1};
        int[] expected = {0,1,2};

        new SortColors().sortColors(nums);

        assertArrayEquals(nums, expected);
    }
}