package striver.sorting;

import com.adnan.striver.sorting2.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    private void compareWithJavaSort(BaseMergeSort sorter) {
        int[] input = {5, -2, 8, -10, 3};
        int[] output = Arrays.copyOf(input, input.length);

        Arrays.sort(output);

        long start = System.nanoTime();
        sorter.sort(input);
        long end = System.nanoTime();

        long duration = end - start;

        System.out.println(sorter.getClass().getSimpleName() + " took: " + duration + " ns");

        assertArrayEquals(output, input);
    }

    @Test
    void testIterative() {
        compareWithJavaSort(new IterativeMergeSort());
    }

    @Test
    void testRecursive() {
        compareWithJavaSort(new RecursiveMergeSort());
    }
}
