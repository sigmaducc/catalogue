package striver.arrays.easy;

import com.adnan.striver.arrays.easy.MaxConsecutiveOnes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesTest {

    @Test
    void test1() {
        int[] nums = {1,1,0,1,1,1};
        int output = 3;

        int result = new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1,0,1,1,0,1};
        int output = 2;

        int result = new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {0};
        int output = 0;

        int result = new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums);

        assertEquals(output, result);
    }

}