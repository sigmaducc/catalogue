package striver.arrays.medium;

import com.adnan.striver.arrays.medium.MergeIntervals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeIntervalsTest {

    @Test
    void test1() {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] output = {{1,6},{8,10},{15,18}};

        int[][] result = new MergeIntervals().merge(intervals);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[][] intervals = {{1,4},{4,5}};
        int[][] output = {{1,5}};

        int[][] result = new MergeIntervals().merge(intervals);

        assertArrayEquals(output, result);
    }

    @Test
    void test3() {
        int[][] intervals = {{4,7},{1,4}};
        int[][] output = {{1,7}};

        int[][] result = new MergeIntervals().merge(intervals);

        assertArrayEquals(output, result);
    }

    @Test
    void test4() {
        int[][] intervals = {{1,4},{1,4}};
        int[][] output = {{1,4}};

        int[][] result = new MergeIntervals().merge(intervals);

        assertArrayEquals(output, result);
    }

    @Test
    void test5() {
        int[][] intervals = {{1,4},{0,4}};
        int[][] output = {{0,4}};

        int[][] result = new MergeIntervals().merge(intervals);

        assertArrayEquals(output, result);
    }

    @Test
    void test6() {
        int[][] intervals = {{1,4},{0,2},{3,5}};
        int[][] output = {{0,5}};

        int[][] result = new MergeIntervals().merge(intervals);

        assertArrayEquals(output, result);
    }

    @Test
    void test7() {
        int[][] intervals = {{1,4},{5,6}};
        int[][] output = {{1,4},{5,6}};

        int[][] result = new MergeIntervals().merge(intervals);

        assertArrayEquals(output, result);
    }

    @Test
    void test8() {
        int[][] intervals = {{2,3},{4,5},{6,7},{8,9},{1,10}};
        int[][] output = {{1,10}};

        int[][] result = new MergeIntervals().merge(intervals);

        assertArrayEquals(output, result);
    }

    @Test
    void test9() {
        int[][] intervals = {{1,3},{2,5},{6,9}};
        int[][] output = {{1,5},{6,9}};

        int[][] result = new MergeIntervals().merge(intervals);

        assertArrayEquals(output, result);
    }

}