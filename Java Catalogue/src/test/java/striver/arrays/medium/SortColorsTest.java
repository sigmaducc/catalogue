package striver.arrays.medium;

import com.adnan.striver.arrays.medium.SortColors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorsTest {

    private final SortColors sortColors = new SortColors();

    @Test
    void testSortColors1() {
        int[] nums = {2,0,2,1,1,0};
        int[] output = {0,0,1,1,2,2};

        sortColors.sortColors(nums);

        assertArrayEquals(nums, output);
    }

    @Test
    void testSortColors2() {
        int[] nums = {2,0,1};
        int[] output = {0,1,2};

        sortColors.sortColors(nums);

        assertArrayEquals(nums, output);
    }
}