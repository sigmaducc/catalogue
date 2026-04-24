package striver.heaps;

import com.adnan.striver.heaps.TopKFrequentElements;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopKFrequentElementsTest {

    private final TopKFrequentElements topKFrequentElements = new TopKFrequentElements();

    @Test
    void test1() {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] output = {1,2};

        int[] result = topKFrequentElements.topKFrequent(nums, k);
        Arrays.sort(result);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1};
        int k = 1;
        int[] output = {1};

        int[] result = topKFrequentElements.topKFrequent(nums, k);
        Arrays.sort(result);

        assertArrayEquals(output, result);
    }

    @Test
    void test3() {
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;
        int[] output = {1,2};

        int[] result = topKFrequentElements.topKFrequent(nums, k);
        Arrays.sort(result);

        assertArrayEquals(output, result);
    }

}