package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.SingleNumber3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SingleNumber3Test {

    private final SingleNumber3 singleNumber3 = new SingleNumber3();

    @Test
    void test1() {
        int[] nums = {1,2,1,3,2,5};
        int[] output = {3,5};

        int[] result = singleNumber3.singleNumber(nums);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {-1,0};
        int[] output = {-1,0};

        int[] result = singleNumber3.singleNumber(nums);

        assertArrayEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {0,1};
        int[] output = {1,0};

        int[] result = singleNumber3.singleNumber(nums);

        assertArrayEquals(output, result);
    }

}