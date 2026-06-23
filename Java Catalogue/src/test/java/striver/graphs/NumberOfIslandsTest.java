package striver.graphs;

import com.adnan.striver.graphs.NumberOfIslands;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfIslandsTest {

    private final NumberOfIslands numberOfIslands = new NumberOfIslands();

    @Test
    void test1() {
        char[][] grid = {
          {'1','1','1','1','0'},
          {'1','1','0','1','0'},
          {'1','1','0','0','0'},
          {'0','0','0','0','0'}
        };
        int output = 1;
        
        int result = numberOfIslands.numIslands(grid);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        char[][] grid = {
          {'1','1','0','0','0'},
          {'1','1','0','0','0'},
          {'0','0','1','0','0'},
          {'0','0','0','1','1'}
        };
        int output = 3;

        int result = numberOfIslands.numIslands(grid);

        assertEquals(output, result);
    }

}