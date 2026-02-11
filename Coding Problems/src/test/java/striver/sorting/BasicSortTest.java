package striver.sorting;

import com.adnan.striver.sorting1.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BasicSortTest {

    private void compareWithJavaSort(BaseSort sorter) {
        int[] input = {5, -2, 8, -10, 3};
        int[] expected = Arrays.copyOf(input, input.length);

        Arrays.sort(expected);

        long start = System.nanoTime();
        sorter.sort(input);
        long end = System.nanoTime();

        long duration = end - start;

        System.out.println(sorter.getClass().getSimpleName() + " took: " + duration + " ns");

        assertArrayEquals(expected, input);
    }

    @Test
    void testInsertionSort() {
        compareWithJavaSort(new InsertionSort());
    }

    @Test
    void testBubbleSort() {
        compareWithJavaSort(new BubbleSort());
    }

    @Test
    void testSelectionSort() {
        compareWithJavaSort(new SelectionSort());
    }
}