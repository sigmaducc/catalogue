package striver.graphs;

import com.adnan.striver.graphs.ZeroOneMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ZeroOneMatrixTest {

    private final ZeroOneMatrix zeroOneMatrix = new ZeroOneMatrix();

    @Test
    void test1() {
        int[][] mat = {{0,0,0}, {0,1,0}, {0,0,0}};
        int[][] output = {{0,0,0}, {0,1,0}, {0,0,0}};

        int[][] result = zeroOneMatrix.updateMatrix(mat);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[][] mat = {{0,0,0}, {0,1,0}, {1,1,1}};
        int[][] output = {{0,0,0}, {0,1,0}, {1,2,1}};

        int[][] result = zeroOneMatrix.updateMatrix(mat);

        assertArrayEquals(output, result);
    }

    @Test
    void test3() {
        int[][] mat = {{0,1,0}, {0,1,0}, {0,1,0}, {0,1,0}, {0,1,0}};
        int[][] output = {{0,1,0}, {0,1,0}, {0,1,0}, {0,1,0}, {0,1,0}};

        int[][] result = zeroOneMatrix.updateMatrix(mat);

        assertArrayEquals(output, result);
    }

}