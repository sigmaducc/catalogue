package striver.arrays.medium;

import com.adnan.striver.arrays.medium.SpiralMatrix;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SpiralMatrixTest {

    @Test
    void testSpiralMatrix1() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,6,9,8,7,4,5));

        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void testSpiralMatrix2() {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7));

        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void testSpiralMatrix3() {
        int[][] matrix = {{2,3}};
        List<Integer> expected = new ArrayList<>(Arrays.asList(2,3));

        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void testSpiralMatrix4() {
        int[][] matrix = {{1}};
        List<Integer> expected = new ArrayList<>(Arrays.asList(1));

        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void testSpiralMatrix5() {
        int[][] matrix = {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
        List<Integer> expected = new ArrayList<>(Arrays.asList(2,3,4,7,10,13,16,15,14,11,8,5,6,9,12));

        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    void testSpiralMatrix6() {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4,8,12,16,20,19,18,17,13,9,5,6,7,11,15,14,10));

        List<Integer> result = new SpiralMatrix().spiralOrder(matrix);

        assertArrayEquals(expected.toArray(), result.toArray());
    }

}