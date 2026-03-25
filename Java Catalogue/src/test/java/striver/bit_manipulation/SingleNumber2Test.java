package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.SingleNumber2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumber2Test {

    private final SingleNumber2 singleNumber2 = new SingleNumber2();

    @Test
    void test1() {
        int[] nums = {2,2,3,2};
        int output = 3;

        int result = singleNumber2.singleNumber(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {0,1,0,1,0,1,99};
        int output = 99;

        int result = singleNumber2.singleNumber(nums);

        assertEquals(output, result);
    }

}