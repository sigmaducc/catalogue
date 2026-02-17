package striver.sorting;

import com.adnan.striver.sorting1.*;
import com.adnan.striver.sorting2.QuickSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BasicSortTest {

    private void compareWithJavaSortWithArr(BaseSort sorter, int[] arr) {
        int[] output = Arrays.copyOf(arr, arr.length);

        Arrays.sort(output);
        long start = System.nanoTime();
        sorter.sort(arr);
        long end = System.nanoTime();

        long duration = end - start;

        System.out.println(sorter.getClass().getSimpleName() + " with arr took: " + duration + " ns");

        assertArrayEquals(output, arr);
    }

    private void compareWithJavaSort(BaseSort sorter) {
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

    @Test
    void testQuickSort() {
        compareWithJavaSort(new QuickSort());
    }

    @Test
    void testQuickSortWithArr() {
        compareWithJavaSortWithArr(new QuickSort(), new int[]{2,0,2,1,1,0});
    }
}