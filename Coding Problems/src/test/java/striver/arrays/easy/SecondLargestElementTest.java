package striver.arrays.easy;

import com.adnan.striver.arrays.easy.SecondLargestElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLargestElementTest {

    @Test
    void test1() {
        int[] nums = {8, 8, 7, 6, 5};
        int output = 7;

        int result = new SecondLargestElement().secondLargestElement(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {10, 10, 10, 10, 10};
        int output = -1;

        int result = new SecondLargestElement().secondLargestElement(nums);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {7, 7, 2, 2, 10, 10, 10};
        int output = 7;

        int result = new SecondLargestElement().secondLargestElement(nums);

        assertEquals(output, result);
    }

}