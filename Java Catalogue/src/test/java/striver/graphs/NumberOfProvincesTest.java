package striver.graphs;

import com.adnan.striver.graphs.NumberOfProvinces;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfProvincesTest {

    private final NumberOfProvinces numberOfProvinces = new NumberOfProvinces();

    @Test
    void test1() {
        int[][] isConnected = {{1,1,0}, {1,1,0}, {0,0,1}};
        int output = 2;

        int result = numberOfProvinces.findCircleNum(isConnected);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[][] isConnected = {{1,0,0}, {0,1,0}, {0,0,1}};
        int output = 3;

        int result = numberOfProvinces.findCircleNum(isConnected);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[][] isConnected = {{1,0,0,1}, {0,1,1,0}, {0,1,1,1}, {1,0,1,1}};
        int output = 1;

        int result = numberOfProvinces.findCircleNum(isConnected);

        assertEquals(output, result);
    }

}