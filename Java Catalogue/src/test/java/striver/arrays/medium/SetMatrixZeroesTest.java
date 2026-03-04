package striver.arrays.medium;

import com.adnan.striver.arrays.medium.SetMatrixZeroes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SetMatrixZeroesTest {

    @Test
    void testSetMatrixZeroes1() {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] outputMatrix = {{1,0,1},{0,0,0},{1,0,1}};

        new SetMatrixZeroes().setZeroes(matrix);

        assertArrayEquals(outputMatrix, matrix);
    }

    @Test
    void testSetMatrixZeroes2() {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] outputMatrix = {{0,0,0,0},{0,4,5,0},{0,3,1,0}};

        new SetMatrixZeroes().setZeroes(matrix);

        assertArrayEquals(outputMatrix, matrix);
    }

    @Test
    void testSetMatrixZeroes3() {
        int[][] matrix = {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
        int[][] outputMatrix = {{0,0,3,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

        new SetMatrixZeroes().setZeroes(matrix);

        assertArrayEquals(outputMatrix, matrix);
    }

}
