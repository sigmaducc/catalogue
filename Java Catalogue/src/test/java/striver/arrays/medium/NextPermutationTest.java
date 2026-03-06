package striver.arrays.medium;

import com.adnan.striver.arrays.medium.NextPermutation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextPermutationTest {

    private final NextPermutation nextPermutation = new NextPermutation();

    @Test
    void test1() {
        int[] nums = {1,2,3};
        int[] output = {1,3,2};

        nextPermutation.nextPermutation(nums);

        assertArrayEquals(output, nums);
    }

    @Test
    void test2() {
        int[] nums = {3,2,1};
        int[] output = {1,2,3};

        nextPermutation.nextPermutation(nums);

        assertArrayEquals(output, nums);
    }

    @Test
    void test3() {
        int[] nums = {1,1,5};
        int[] output = {1,5,1};

        nextPermutation.nextPermutation(nums);

        assertArrayEquals(output, nums);
    }

    @Test
    void test4() {
        int[] nums = {2,1,5,4,3,0,0};
        int[] output = {2,3,0,0,1,4,5};

        nextPermutation.nextPermutation(nums);

        assertArrayEquals(output, nums);
    }

}