package striver.basics.medium;

import com.adnan.striver.basics.medium.RearrangeArrayElementsBySign;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RearrangeArrayElementsBySignTest {

    @Test
    void testRearrangeArrayElementsBySign1() {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] expected = {3,-2,1,-5,2,-4};

        int[] result = new RearrangeArrayElementsBySign().rearrangeArray(nums);

        assertArrayEquals(expected, result);
    }

    @Test
    void testRearrangeArrayElementsBySign2() {
        int[] nums = {-1,1};
        int[] expected = {1,-1};

        int[] result = new RearrangeArrayElementsBySign().rearrangeArray(nums);

        assertArrayEquals(expected, result);
    }

}