package striver.stack_queue;

import com.adnan.striver.stack_queue.NextGreaterElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextGreaterElementTest {

    private final NextGreaterElement nextGreaterElement = new NextGreaterElement();

    @Test
    void test1() {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] output = {-1,3,-1};

        int[] result = nextGreaterElement.nextGreaterElement(nums1, nums2);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        int[] output = {3,-1};

        int[] result = nextGreaterElement.nextGreaterElement(nums1, nums2);

        assertArrayEquals(output, result);
    }

}