package striver.basics;

import com.adnan.striver.basics.FrequencyOfTheMostFrequentElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequencyOfTheMostFrequentElementTest {

    @Test
    void test() {
        int[] nums = {1, 4, 8, 13};
        int k = 5;
        int result = new FrequencyOfTheMostFrequentElement().maxFrequency(nums, k);

        assertEquals(2, result);
    }

    @Test
    void testLargeK() {
        int[] nums = {9940, 9995, 9944, 9937, 9941, 9952, 9907, 9952, 9987, 9964, 9940, 9914, 9941, 9933, 9912, 9934, 9980, 9907, 9980, 9944, 9910, 9997};
        int k = 7925;
        int result = new FrequencyOfTheMostFrequentElement().maxFrequency(nums, k);

        assertEquals(22, result);
    }

    @Test
    void testDuplicates() {
        int[] nums = {1,1,1,1,5,6,7,7};
        int k = 9;
        int result = new FrequencyOfTheMostFrequentElement().maxFrequency(nums, k);

        assertEquals(5, result);
    }

    @Test
    void test100000_9999s_WithOne10000() {
        int n = 100_000;
        int[] nums = new int[n];

        int k = 100_000;
        nums[0] = 10_000;

        for(int i = 1; i <= n - 1; i++) {
            nums[i] = 9_999;
        }

        int result = new FrequencyOfTheMostFrequentElement().maxFrequency(nums, k);

        assertEquals(100_000, result);
    }

    @Test
    void test30000_1s_WithOne10000() {
        int n = 30_000;
        int[] nums = new int[n];

        int k = 1;
        nums[0] = 10_000;

        for(int i = 1; i <= n - 1; i++) {
            nums[i] = 1;
        }

        int result = new FrequencyOfTheMostFrequentElement().maxFrequency(nums, k);

        assertEquals(29_999, result);
    }
}