package striver.arrays.medium;

import com.adnan.striver.arrays.medium.RotateImage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateImageTest {

    @Test
    void testRotateImage1() {
        int[][] matrix = {{4, 8}, {3, 6}};
        int[][] expectedMatrix = {{3, 4}, {6, 8}};

        new RotateImage().rotate(matrix);

        assertArrayEquals(expectedMatrix, matrix);
    }

    @Test
    void testRotateImage2() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] expectedMatrix = {{7,4,1},{8,5,2},{9,6,3}};

        new RotateImage().rotate(matrix);

        assertArrayEquals(expectedMatrix, matrix);
    }

    @Test
    void testRotateImage3() {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] expectedMatrix = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};

        new RotateImage().rotate(matrix);

        assertArrayEquals(expectedMatrix, matrix);
    }

    @Test
    void testRotateImage4() {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] expectedMatrix = {{21,16,11,6,1},{22,17,12,7,2},{23,18,13,8,3},{24,19,14,9,4},{25,20,15,10,5}};

        new RotateImage().rotate(matrix);

        assertArrayEquals(expectedMatrix, matrix);
    }
}