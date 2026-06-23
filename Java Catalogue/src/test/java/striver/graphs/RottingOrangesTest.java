package striver.graphs;

import com.adnan.striver.graphs.RottingOranges;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RottingOrangesTest {

    private final RottingOranges rottingOranges = new RottingOranges();

    @Test
    void test1() {
        int[][] grid = {{2,1,1}, {1,1,0}, {0,1,1}};
        int output = 4;

        int result = rottingOranges.orangesRotting(grid);

        assertEquals(output, result);
    }


    @Test
    void test2() {
        int[][] grid = {{2,1,1}, {0,1,1}, {1,0,1}};
        int output = -1;

        int result = rottingOranges.orangesRotting(grid);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[][] grid = {{0,2}};
        int output = 0;

        int result = rottingOranges.orangesRotting(grid);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[][] grid = {{0}};
        int output = 0;

        int result = rottingOranges.orangesRotting(grid);

        assertEquals(output, result);
    }

}