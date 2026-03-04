package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.SingleElementInASortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleElementInASortedArrayTest {

    @Test
    void test1() {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int output = 2;

        int result = new SingleElementInASortedArray().singleNonDuplicate(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {3,3,7,7,10,11,11};
        int output = 10;

        int result = new SingleElementInASortedArray().singleNonDuplicate(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {1};
        int output = 1;

        int result = new SingleElementInASortedArray().singleNonDuplicate(nums);

        assertEquals(output, result);
    }

}