package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.CountPrimes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPrimesTest {

    private final CountPrimes countPrimes = new CountPrimes();

    @Test
    void test1() {
        int n = 10;
        int output = 4;

        int result = countPrimes.countPrimes(n);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int n = 0;
        int output = 0;

        int result = countPrimes.countPrimes(n);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int n = 1;
        int output = 0;

        int result = countPrimes.countPrimes(n);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int n = 2;
        int output = 0;

        int result = countPrimes.countPrimes(n);

        assertEquals(output, result);
    }

}