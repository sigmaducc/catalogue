package striver.arrays.easy;

import com.adnan.striver.arrays.easy.FindMissingNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMissingNumberTest {

    @Test
    void test1() {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int output = 6;

        int result = new FindMissingNumber().missingNum(arr);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] arr = {1, 2, 3, 5};
        int output = 4;

        int result = new FindMissingNumber().missingNum(arr);

        assertEquals(output, result);
    }

}