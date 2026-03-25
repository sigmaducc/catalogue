package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.FindTheXorOfNumbersWhichAppearTwice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheXorOfNumbersWhichAppearTwiceTest {

    private final FindTheXorOfNumbersWhichAppearTwice findTheXorOfNumbersWhichAppearTwice = new FindTheXorOfNumbersWhichAppearTwice();

    @Test
    void test1() {
        int[] nums = {1,2,1,3};
        int output = 1;

        int result = findTheXorOfNumbersWhichAppearTwice.duplicateNumbersXOR(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {1,2,3};
        int output = 0;

        int result = findTheXorOfNumbersWhichAppearTwice.duplicateNumbersXOR(nums);

        assertEquals(output, result);
    }

}