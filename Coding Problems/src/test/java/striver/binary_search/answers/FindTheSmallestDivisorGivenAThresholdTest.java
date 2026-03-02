package striver.binary_search.answers;

import com.adnan.striver.binary_search.answers.FindTheSmallestDivisorGivenAThreshold;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheSmallestDivisorGivenAThresholdTest {

    @Test
    void test1() {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        int output = 5;

        int result = new FindTheSmallestDivisorGivenAThreshold().smallestDivisor(nums, threshold);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {44,22,33,11,1};
        int threshold = 5;
        int output = 44;

        int result = new FindTheSmallestDivisorGivenAThreshold().smallestDivisor(nums, threshold);

        assertEquals(output, result);
    }

}