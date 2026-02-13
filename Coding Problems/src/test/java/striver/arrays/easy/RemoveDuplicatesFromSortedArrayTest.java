package striver.arrays.easy;

import com.adnan.striver.arrays.easy.RemoveDuplicatesFromSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void testRemoveDuplicatesFromSortedArray1() {
        int[] nums = {1,1,2};
        int[] expected = {1,2,2};

        int result = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);

        assertEquals(2, result);
    }

    @Test
    void testRemoveDuplicatesFromSortedArray2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expected = {0,1,2,3,4,2,2,3,3,4};

        int result = new RemoveDuplicatesFromSortedArray().removeDuplicates(nums);

        assertEquals(5, result);
    }

}