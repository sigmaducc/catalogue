package striver.basics.easy;

import com.adnan.striver.basics.easy.FindGCDOfTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindGCDOfTwoNumbersTest {

    private final FindGCDOfTwoNumbers findGCDOfTwoNumbers = new FindGCDOfTwoNumbers();

    @Test
    void test1() {
        int n1 = 9;
        int n2 = 12;

        int output = 3;

        int result = findGCDOfTwoNumbers.gcd(n1, n2);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int n1 = 20;
        int n2 = 15;

        int output = 5;

        int result = findGCDOfTwoNumbers.gcd(n1, n2);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int n1 = 48;
        int n2 = 18;

        int output = 6;

        int result = findGCDOfTwoNumbers.gcd(n1, n2);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int n1 = 24;
        int n2 = 36;

        int output = 12;

        int result = findGCDOfTwoNumbers.gcd(n1, n2);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        int n1 = 12;
        int n2 = 26;

        int output = 2;

        int result = findGCDOfTwoNumbers.gcd(n1, n2);

        assertEquals(output, result);
    }

}