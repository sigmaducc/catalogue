package striver.basics.easy;

import com.adnan.striver.basics.easy.CheckIfANumberIsPrimeOrNot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfANumberIsPrimeOrNotTest {

    @Test
    void test1() {
        int n = 2;

        boolean result = new CheckIfANumberIsPrimeOrNot().isPrime(n);

        assertTrue(result);
    }

    @Test
    void test2() {
        int n = 10;

        boolean result = new CheckIfANumberIsPrimeOrNot().isPrime(n);

        assertFalse(result);
    }

    @Test
    void test3() {
        int n = 29;

        boolean result = new CheckIfANumberIsPrimeOrNot().isPrime(n);

        assertTrue(result);
    }

    @Test
    void test4() {
        int n = 11;

        boolean result = new CheckIfANumberIsPrimeOrNot().isPrime(n);

        assertTrue(result);
    }

    @Test
    void test5() {
        int n = 15;

        boolean result = new CheckIfANumberIsPrimeOrNot().isPrime(n);

        assertFalse(result);
    }

    @Test
    void test6() {
        int n = 35;

        boolean result = new CheckIfANumberIsPrimeOrNot().isPrime(n);

        assertFalse(result);
    }

    @Test
    void test7() {
        int n = 417;

        boolean result = new CheckIfANumberIsPrimeOrNot().isPrime(n);

        assertFalse(result);
    }

    @Test
    void test8() {
        int n = 55_409_243;

        boolean result = new CheckIfANumberIsPrimeOrNot().isPrime(n);

        assertFalse(result);
    }

}