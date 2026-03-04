package striver.arrays.easy;

import com.adnan.striver.arrays.easy.MoveZeroes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    void test1() {
        int[] nums = {0,1,0,3,12};
        int[] output = {1,3,12,0,0};

        new MoveZeroes().moveZeroes(nums);

        assertArrayEquals(output, nums);
    }

    @Test
    void test2() {
        int[] nums = {0};
        int[] output = {0};

        new MoveZeroes().moveZeroes(nums);

        assertArrayEquals(output, nums);
    }

    @Test
    void test3() {
        int[] nums = {1,0};
        int[] output = {1,0};

        new MoveZeroes().moveZeroes(nums);

        assertArrayEquals(output, nums);
    }

    @Test
    void test4() {
        int[] nums = {1,0,1};
        int[] output = {1,1,0};

        new MoveZeroes().moveZeroes(nums);

        assertArrayEquals(output, nums);
    }

}