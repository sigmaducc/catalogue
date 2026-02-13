package striver.arrays.easy;

import com.adnan.striver.arrays.easy.CheckIfArrayIsSortedAndRotated;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfArrayIsSortedAndRotatedTest {

    @Test
    void testIsArraySortedAndRotatedForTrue1() {
        int[] arr = {3, 4, 5, 1, 2};

        boolean isArraySortedAndRotated = new CheckIfArrayIsSortedAndRotated().isArraySortedAndRotated(arr);

        assertTrue(isArraySortedAndRotated);
    }

    @Test
    void testIsArraySortedAndRotatedForTrue2() {
        int[] arr = {1,2,3};

        boolean isArraySortedAndRotated = new CheckIfArrayIsSortedAndRotated().isArraySortedAndRotated(arr);

        assertTrue(isArraySortedAndRotated);
    }

    @Test
    void testIsArraySortedAndRotatedForFalse() {
        int[] arr = {2, 1, 3, 4};

        boolean isArraySortedAndRotated = new CheckIfArrayIsSortedAndRotated().isArraySortedAndRotated(arr);

        assertFalse(isArraySortedAndRotated);
    }

}