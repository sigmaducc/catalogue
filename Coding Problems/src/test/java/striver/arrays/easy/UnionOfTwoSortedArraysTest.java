package striver.arrays.easy;

import com.adnan.striver.arrays.easy.UnionOfTwoSortedArrays;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class UnionOfTwoSortedArraysTest {

    @Test
    void test1() {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};

        List<Integer> output = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        List<Integer> result = new UnionOfTwoSortedArrays().union(arr1, arr2);

        assertArrayEquals(output.toArray(), result.toArray());
    }

    @Test
    void test2() {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};

        List<Integer> output = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));

        List<Integer> result = new UnionOfTwoSortedArrays().union(arr1, arr2);

        assertArrayEquals(output.toArray(), result.toArray());
    }

}