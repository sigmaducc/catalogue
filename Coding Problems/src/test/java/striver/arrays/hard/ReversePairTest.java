package striver.arrays.hard;

import com.adnan.striver.arrays.hard.ReversePair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePairTest {

    @Test
    void test1() {
        int[] nums = {1,3,2,3,1};
        int output = 2;

        int result = new ReversePair().reversePairs(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {2,4,3,5,1};
        int output = 3;

        int result = new ReversePair().reversePairs(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        int output = 0;

        int result = new ReversePair().reversePairs(nums);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {5,4,3,2,1};
        int output = 4;

        int result = new ReversePair().reversePairs(nums);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {2147483647,2147483647,-2147483647,-2147483647,-2147483647,2147483647};
        int output = 9;

        int result = new ReversePair().reversePairs(nums);

        assertEquals(output, result);
    }

}