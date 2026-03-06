package striver.arrays.easy;

import com.adnan.striver.arrays.easy.DetermineWhetherMatrixCanBeObtainedByRotation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetermineWhetherMatrixCanBeObtainedByRotationTest {

    private final DetermineWhetherMatrixCanBeObtainedByRotation determineWhetherMatrixCanBeObtainedByRotation = new DetermineWhetherMatrixCanBeObtainedByRotation();

    @Test
    void test1() {
        int[][] matrix = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};

        boolean result = determineWhetherMatrixCanBeObtainedByRotation.findRotation(matrix, target);

        assertTrue(result);
    }

    @Test
    void test2() {
        int[][] matrix = {{0,1},{1,1}};
        int[][] target = {{1,0},{0,1}};

        boolean result = determineWhetherMatrixCanBeObtainedByRotation.findRotation(matrix, target);

        assertFalse(result);
    }

    @Test
    void test3() {
        int[][] matrix = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};

        boolean result = determineWhetherMatrixCanBeObtainedByRotation.findRotation(matrix, target);

        assertTrue(result);
    }

}