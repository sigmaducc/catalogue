package striver.heaps;

import com.adnan.striver.heaps.KthLargestElement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class KthLargestElementTest {

    private KthLargestElement kthLargestElement;

    @Test
    void test1() {
        int k = 4;
        int[] nums = { 7, 7, 7, 7, 8, 3 };
        String[] operations = {"KthLargest", "add", "add", "add", "add"};
        int[][] args = { {}, {2}, {10}, {9}, {9} };
        Object[] expected = { null, 7, 7, 7, 8 };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "KthLargest":
                    kthLargestElement = new KthLargestElement(k, nums);
                    assertNull(null);
                    break;
                case "add":
                    int result = kthLargestElement.add(args[i][0]);
                    assertEquals(expected[i], result);
                    break;
            }
        }
    }

    @Test
    void test2() {
        int k = 3;
        int[] nums = { 4, 5, 8, 2 };
        String[] operations = {"KthLargest", "add", "add", "add", "add", "add"};
        int[][] args = { {}, {3}, {5}, {10}, {9}, {4} };
        Object[] expected = { null, 4, 5, 5, 8, 8 };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "KthLargest":
                    kthLargestElement = new KthLargestElement(k, nums);
                    assertNull(null);
                    break;
                case "add":
                    int result = kthLargestElement.add(args[i][0]);
                    assertEquals(expected[i], result);
                    break;
            }
        }
    }

}