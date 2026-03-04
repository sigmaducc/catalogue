package striver.arrays.medium;

import com.adnan.striver.arrays.medium.InsertInterval;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertIntervalTest {

    @Test
    void test1() {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] output = {{1,5},{6,9}};

        int[][] result = new InsertInterval().insert(intervals, newInterval);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] output = {{1,2},{3,10},{12,16}};

        int[][] result = new InsertInterval().insert(intervals, newInterval);

        assertArrayEquals(output, result);
    }

    @Test
    void test3() {
        int[][] intervals = {};
        int[] newInterval = {5,7};
        int[][] output = {{5,7}};

        int[][] result = new InsertInterval().insert(intervals, newInterval);

        assertArrayEquals(output, result);
    }

    @Test
    void test4() {
        int[][] intervals = {{1,5}};
        int[] newInterval = {0,3};
        int[][] output = {{0,5}};

        int[][] result = new InsertInterval().insert(intervals, newInterval);

        assertArrayEquals(output, result);
    }

    @Test
    void test5() {
        int[][] intervals = {{2,3},{5,7}};
        int[] newInterval = {0,6};
        int[][] output = {{0,7}};

        int[][] result = new InsertInterval().insert(intervals, newInterval);

        assertArrayEquals(output, result);
    }

    @Test
    void test6() {
        int[][] intervals = {{1,5}};
        int[] newInterval = {0,0};
        int[][] output = {{0,0},{1,5}};

        int[][] result = new InsertInterval().insert(intervals, newInterval);

        assertArrayEquals(output, result);
    }

}