package interviews.oa;

import com.adnan.interviews.oa.CountBinarySubstrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountBinarySubstringsTest {

    @Test
    void test1() {
        String s = "011001";
        int output = 4;

        int result = new CountBinarySubstrings().countBinarySubstrings(s);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        String s = "001100011";
        int output = 6;

        int result = new CountBinarySubstrings().countBinarySubstrings(s);

        assertEquals(output, result);
    }

}