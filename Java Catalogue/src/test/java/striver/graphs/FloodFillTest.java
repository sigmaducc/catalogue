package striver.graphs;

import com.adnan.striver.graphs.FloodFill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FloodFillTest {

    private final FloodFill floodFill = new FloodFill();

    @Test
    void test1() {
        int[][] image = {{1,1,1}, {1,1,0}, {1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;

        int[][] output = {{2,2,2}, {2,2,0}, {2,0,1}};

        int[][] result = floodFill.floodFill(image, sr, sc, color);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[][] image = {{0,0,0}, {0,0,0}};
        int sr = 0;
        int sc = 0;
        int color = 0;

        int[][] output = {{0,0,0}, {0,0,0}};

        int[][] result = floodFill.floodFill(image, sr, sc, color);

        assertArrayEquals(output, result);
    }

}