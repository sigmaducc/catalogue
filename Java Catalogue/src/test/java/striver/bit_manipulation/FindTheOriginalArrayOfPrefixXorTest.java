package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.FindTheOriginalArrayOfPrefixXor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindTheOriginalArrayOfPrefixXorTest {

    private final FindTheOriginalArrayOfPrefixXor findTheOriginalArrayOfPrefixXor = new FindTheOriginalArrayOfPrefixXor();

    @Test
    void test1() {
        int[] pref = {5,2,0,3,1};
        int[] output = {5,7,2,3,2};

        int[] result = findTheOriginalArrayOfPrefixXor.findArray(pref);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] pref = {13};
        int[] output = {13};

        int[] result = findTheOriginalArrayOfPrefixXor.findArray(pref);

        assertArrayEquals(output, result);
    }

}