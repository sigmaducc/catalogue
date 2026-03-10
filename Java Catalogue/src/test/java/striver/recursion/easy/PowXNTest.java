package striver.recursion.easy;

import com.adnan.striver.recursion.easy.PowXN;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowXNTest {

    private final PowXN powXN = new PowXN();

    @Test
    void test1() {
        double x = 2.00000;
        int n = 10;
        double output = 1024.0;

        double result = powXN.myPow(x, n);

        assertEquals(output, result, 0.00001);
    }

    @Test
    void test2() {
        double x = 2.10000;
        int n = 3;
        double output = 9.26100;

        double result = powXN.myPow(x, n);

        assertEquals(output, result, 0.00001);
    }

    @Test
    void test3() {
        double x = 2.00000;
        int n = -2;
        double output = 0.25000;

        double result = powXN.myPow(x, n);

        assertEquals(output, result, 0.00001);
    }

    @Test
    void test4() {
        double x = 2.00000;
        int n = -200000000;
        double output = 0;

        double result = powXN.myPow(x, n);

        assertEquals(output, result, 0.00001);
    }

    @Test
    void test5() {
        double x = 2.00000;
        int n = 200000000;
        double output = Double.POSITIVE_INFINITY;

        double result = powXN.myPow(x, n);

        assertEquals(output, result, 0.00001);
    }

    @Test
    void test6() {
        double x = 0.44528;
        int n = 0;
        double output = 1;

        double result = powXN.myPow(x, n);

        assertEquals(output, result, 0.00001);
    }

    @Test
    void test7() {
        double x = 1.00001;
        int n = 123456;
        double output = 3.43684;

        double result = powXN.myPow(x, n);

        assertEquals(output, result, 0.00001);
    }

    @Test
    void test8() {
        double x = 2.00000;
        int n = -2147483648;
        double output = 0;

        double result = powXN.myPow(x, n);

        assertEquals(output, result, 0.00001);
    }

}