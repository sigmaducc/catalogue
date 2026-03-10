package striver.recursion.easy;

import com.adnan.striver.recursion.easy.CountGoodNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountGoodNumbersTest {

    private final CountGoodNumbers countGoodNumbers = new CountGoodNumbers();

    @Test
    void test1() {
        long n = 1;
        int output = 5;

        int result = countGoodNumbers.countGoodNumbers(n);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        long n = 4;
        int output = 400;

        int result = countGoodNumbers.countGoodNumbers(n);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        long n = 50;
        int output = 564908303;

        int result = countGoodNumbers.countGoodNumbers(n);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        long n = 1924;
        int output = 805821919;

        int result = countGoodNumbers.countGoodNumbers(n);

        assertEquals(output, result);
    }

}