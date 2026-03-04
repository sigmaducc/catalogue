package striver.arrays.easy;

import com.adnan.striver.arrays.easy.SingleNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test
    void test1() {
        int[] nums = {2,2,1};
        int output = 1;

        int result = new SingleNumber().singleNumber(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {4,1,2,1,2};
        int output = 4;

        int result = new SingleNumber().singleNumber(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {1};
        int output = 1;

        int result = new SingleNumber().singleNumber(nums);

        assertEquals(output, result);
    }

}