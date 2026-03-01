package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.LowerBound;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowerBoundTest {

    @Test
    void test1() {
        int[] nums = {1,2,2,3};
        int x = 2;
        int output = 1;

        int result = new LowerBound().search(nums, x);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {3,5,8,15,19};
        int x = 9;
        int output = 3;

        int result = new LowerBound().search(nums, x);

        assertEquals(output, result);
    }

}