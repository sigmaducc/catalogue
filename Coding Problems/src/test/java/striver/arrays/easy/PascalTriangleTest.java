package striver.arrays.easy;

import com.adnan.striver.arrays.easy.PascalTriangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class PascalTriangleTest {

    @Test
    void test1() {
        int numRows = 5;
        List<List<Integer>> output = new ArrayList<>(List.of(
            List.of(1),
            List.of(1, 1),
            List.of(1, 2, 1),
            List.of(1, 3, 3, 1),
            List.of(1, 4, 6, 4, 1)
        ));

        List<List<Integer>> result = new PascalTriangle().generate(numRows);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        int numRows = 1;
        List<List<Integer>> output = new ArrayList<>(List.of(
            List.of(1)
        ));

        List<List<Integer>> result = new PascalTriangle().generate(numRows);

        assertIterableEquals(output, result);
    }

    @Test
    void test3() {
        int numRows = 3;
        List<List<Integer>> output = new ArrayList<>(List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1)
        ));

        List<List<Integer>> result = new PascalTriangle().generate(numRows);

        assertIterableEquals(output, result);
    }

}