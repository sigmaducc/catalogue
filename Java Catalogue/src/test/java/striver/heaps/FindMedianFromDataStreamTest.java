package striver.heaps;

import com.adnan.striver.heaps.FindMedianFromDataStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FindMedianFromDataStreamTest {

    private FindMedianFromDataStream findMedianFromDataStream;

    @Test
    void test1() {
        String[] operations = {"MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"};
        int[][] args = { {}, {1}, {2}, {}, {3}, {} };
        Object[] expected = { null, null, null, 1.5, null, 2.0 };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MedianFinder":
                    findMedianFromDataStream = new FindMedianFromDataStream();
                    assertNull(expected[i]);
                    break;
                case "addNum":
                    findMedianFromDataStream.addNum(args[i][0]);
                    assertNull(expected[i]);
                    break;
                case "findMedian":
                    double median = findMedianFromDataStream.findMedian();
                    assertEquals(expected[i], median);
                    break;
            }
        }
    }

    @Test
    void test2() {
        String[] operations = {"MedianFinder","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian"};
        int[][] args = {{},{1},{},{2},{},{3},{},{4},{},{5},{},{6},{},{7},{},{8},{},{9},{},{10},{}};
        Object[] expected = { null,null,1.00000,null,1.50000,null,2.00000,null,2.50000,null,3.00000,null,3.50000,null,4.00000,null,4.50000,null,5.00000,null,5.50000 };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MedianFinder":
                    findMedianFromDataStream = new FindMedianFromDataStream();
                    assertNull(expected[i]);
                    break;
                case "addNum":
                    findMedianFromDataStream.addNum(args[i][0]);
                    assertNull(expected[i]);
                    break;
                case "findMedian":
                    double median = findMedianFromDataStream.findMedian();
                    assertEquals(expected[i], median);
                    break;
            }
        }
    }

}