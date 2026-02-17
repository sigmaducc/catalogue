package striver.arrays.medium;

import com.adnan.striver.arrays.medium.LongestConsecutiveSequence;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveSequenceTest {

    @Test
    void test1() {
        int[] nums = {100,4,200,1,3,2};
        int output = 4;

        int result = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int output = 9;

        int result = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {1,0,1,2};
        int output = 3;

        int result = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] nums = {};
        int output = 0;

        int result = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int[] nums = {1,2,6,7,8};
        int output = 3;

        int result = new LongestConsecutiveSequence().longestConsecutive(nums);

        assertEquals(output, result);
    }

}