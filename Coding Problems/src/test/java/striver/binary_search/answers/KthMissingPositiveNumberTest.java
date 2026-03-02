package striver.binary_search.answers;

import com.adnan.striver.binary_search.answers.KthMissingPositiveNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthMissingPositiveNumberTest {

    @Test
    void test1() {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int output = 9;

        int result = new KthMissingPositiveNumber().findKthPositive(arr, k);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] arr = {1,2,3,4};
        int k = 2;
        int output = 6;

        int result = new KthMissingPositiveNumber().findKthPositive(arr, k);

        assertEquals(output, result);
    }

}