package striver.binary_search.array_2d;

import com.adnan.striver.binary_search.array_2d.FindAPeakElement2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindAPeakElement2Test {

    @Test
    void test1() {
        int[][] matrix = {{1,4},{3,2}};
        int[] output = {0,1};

        int[] result = new FindAPeakElement2().findPeakGrid(matrix);

        Arrays.sort(output);
        Arrays.sort(result);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[][] matrix = {{10,20,15},{21,30,14},{7,16,32}};
        int[] output = {1,1};

        int[] result = new FindAPeakElement2().findPeakGrid(matrix);

        Arrays.sort(output);
        Arrays.sort(result);

        assertArrayEquals(output, result);
    }

}