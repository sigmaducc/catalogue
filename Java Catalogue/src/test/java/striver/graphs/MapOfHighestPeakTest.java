package striver.graphs;

import com.adnan.striver.graphs.MapOfHighestPeak;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MapOfHighestPeakTest {

    private final MapOfHighestPeak mapOfHighestPeak = new MapOfHighestPeak();

    @Test
    void test1() {
        int[][] isWater = {{0,1}, {0,0}};
        int[][] output = {{1,0}, {2,1}};

        int[][] result = mapOfHighestPeak.highestPeak(isWater);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[][] isWater = {{0,0,1}, {1,0,0}, {0,0,0}};
        int[][] output = {{1,1,0}, {0,1,1}, {1,2,2}};

        int[][] result = mapOfHighestPeak.highestPeak(isWater);

        assertArrayEquals(output, result);
    }

}