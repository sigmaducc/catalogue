package striver.binary_search.array_2d;

import com.adnan.striver.binary_search.array_2d.SearchA2DMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchA2DMatrixTest {
    
    @Test
    void test1() {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        
        boolean result = new SearchA2DMatrix().searchMatrix(matrix, target);
        
        assertTrue(result);
    }

    @Test
    void test2() {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;

        boolean result = new SearchA2DMatrix().searchMatrix(matrix, target);

        assertFalse(result);
    }

    @Test
    void test3() {
        int[][] matrix = {{1,1}};
        int target = 2;

        boolean result = new SearchA2DMatrix().searchMatrix(matrix, target);

        assertFalse(result);
    }

}