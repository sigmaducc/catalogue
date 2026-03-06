package striver.strings.medium;

import com.adnan.striver.strings.medium.SumOfBeautyOfAllSubstrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfBeautyOfAllSubstringsTest {

    private final SumOfBeautyOfAllSubstrings sumOfBeautyOfAllSubstrings = new SumOfBeautyOfAllSubstrings();

    @Test
    void test1() {
        String s = "aabcb";
        int output = 5;

        int result = sumOfBeautyOfAllSubstrings.beautySum(s);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = "aabcbaa";
        int output = 17;

        int result = sumOfBeautyOfAllSubstrings.beautySum(s);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String s = "xzvfsppsjfbxdwkqe";
        int output = 64;

        int result = sumOfBeautyOfAllSubstrings.beautySum(s);

        assertEquals(output, result);
    }

}