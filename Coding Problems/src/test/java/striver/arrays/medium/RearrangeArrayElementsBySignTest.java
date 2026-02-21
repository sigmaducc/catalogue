package striver.arrays.medium;

import com.adnan.striver.arrays.medium.RearrangeArrayElementsBySign;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RearrangeArrayElementsBySignTest {

    @Test
    void testRearrangeArrayElementsBySign1() {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] output = {3,-2,1,-5,2,-4};

        int[] result = new RearrangeArrayElementsBySign().rearrangeArray(nums);

        assertArrayEquals(output, result);
    }

    @Test
    void testRearrangeArrayElementsBySign2() {
        int[] nums = {-1,1};
        int[] output = {1,-1};

        int[] result = new RearrangeArrayElementsBySign().rearrangeArray(nums);

        assertArrayEquals(output, result);
    }

}