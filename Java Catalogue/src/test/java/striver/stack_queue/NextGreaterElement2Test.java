package striver.stack_queue;

import com.adnan.striver.stack_queue.NextGreaterElement2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextGreaterElement2Test {

    private final NextGreaterElement2 nextGreaterElement2 = new NextGreaterElement2();

    @Test
    void test1() {
        int[] nums = {1,2,1};
        int[] output = {2,-1,2};

        int[] result = nextGreaterElement2.nextGreaterElements(nums);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1,2,3,4,3};
        int[] output = {2,3,4,-1,4};

        int[] result = nextGreaterElement2.nextGreaterElements(nums);

        assertArrayEquals(output, result);
    }

}