package striver.binary_search.array_2d;

import com.adnan.striver.binary_search.array_2d.SearchA2DMatrix;
import com.adnan.striver.binary_search.array_2d.SearchA2DMatrix2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchA2DMatrixTest {

    private final SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();

    @Test
    void test1() {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        
        boolean result = searchA2DMatrix.searchMatrix(matrix, target);
        
        assertTrue(result);
    }

    @Test
    void test2() {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;

        boolean result = searchA2DMatrix.searchMatrix(matrix, target);

        assertFalse(result);
    }

    @Test
    void test3() {
        int[][] matrix = {{1,1}};
        int target = 2;

        boolean result = searchA2DMatrix.searchMatrix(matrix, target);

        assertFalse(result);
    }

}