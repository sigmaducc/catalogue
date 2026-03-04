package striver.binary_search.array_2d;

import com.adnan.striver.binary_search.array_2d.SearchA2DMatrix2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchA2DMatrix2Test {

    @Test
    void test1() {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;

        boolean result = new SearchA2DMatrix2().searchMatrix(matrix, target);

        assertTrue(result);
    }

    @Test
    void test2() {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 20;

        boolean result = new SearchA2DMatrix2().searchMatrix(matrix, target);

        assertFalse(result);
    }

    @Test
    void test3() {
        int[][] matrix = {{5},{6}};
        int target = 6;

        boolean result = new SearchA2DMatrix2().searchMatrix(matrix, target);

        assertTrue(result);
    }

    @Test
    void test4() {
        int[][] matrix = {{-5}};
        int target = -10;

        boolean result = new SearchA2DMatrix2().searchMatrix(matrix, target);

        assertFalse(result);
    }

    @Test
    void test5() {
        int[][] matrix = {{1,4},{2,5}};
        int target = 2;

        boolean result = new SearchA2DMatrix2().searchMatrix(matrix, target);

        assertTrue(result);
    }

    @Test
    void test6() {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int target = 19;

        boolean result = new SearchA2DMatrix2().searchMatrix(matrix, target);

        assertTrue(result);
    }

}