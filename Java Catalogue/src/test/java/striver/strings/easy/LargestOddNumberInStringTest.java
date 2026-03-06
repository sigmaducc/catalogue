package striver.strings.easy;

import com.adnan.striver.strings.easy.LargestOddNumberInString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestOddNumberInStringTest {

    private final LargestOddNumberInString largestOddNumberInString = new LargestOddNumberInString();

    @Test
    void test1() {
        String num = "52";
        String output = "5";

        String result = largestOddNumberInString.largestOddNumber(num);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String num = "4206";
        String output = "";

        String result = largestOddNumberInString.largestOddNumber(num);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        String num = "35427";
        String output = "35427";

        String result = largestOddNumberInString.largestOddNumber(num);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        String num = "7542351161";
        String output = "7542351161";

        String result = largestOddNumberInString.largestOddNumber(num);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        String num = "23953767242388496965";
        String output = "23953767242388496965";

        String result = largestOddNumberInString.largestOddNumber(num);

        assertEquals(output, result);
    }

    @Test
    void test6() {
        String num = "32782489638346578713315098393010310518347382";
        String output = "327824896383465787133150983930103105183473";

        String result = largestOddNumberInString.largestOddNumber(num);

        assertEquals(output, result);
    }

}