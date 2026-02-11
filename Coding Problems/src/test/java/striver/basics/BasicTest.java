package striver.basics;

import com.adnan.striver.basics.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasicTest {

    private void compareFib(BaseFibonacci fibonacci) {
        int n = 10;

        long start = System.nanoTime();
        int result = fibonacci.fib(n);
        long end = System.nanoTime();

        int expected = 55;

        long duration = end - start;

        System.out.println(fibonacci.getClass().getSimpleName() + " took: " + duration + " ns");

        assertEquals(expected, result);
    }

    @Test
    void testRecursiveFibonacci() {
        compareFib(new RecursiveFibonacci());
    }

    @Test
    void testIterativeFibonacci() {
        compareFib(new IterativeFibonacci());
    }

    @Test
    void testValidPalindrome() {
        String str = "A man, a plan, a canal: Panama";
        boolean result = new ValidPalindrome().isPalindrome(str);

        System.out.println(str + " is a palindrome");

        assertTrue(result);
    }

    @Test
    void testValidPalindromeWithNumber() {
        String str = "0P";
        boolean result = new ValidPalindrome().isPalindrome(str);

        System.out.println(str + " is not a palindrome");

        assertFalse(result);
    }

    @Test
    void testValidPalindromeNumber() {
        int num = 121;
        boolean result = new PalindromeNumber().isPalindrome(num);

        System.out.println(num + " is a palindrome number");

        assertTrue(result);
    }

    @Test
    void testInvalidPalindromeNumber() {
        int num = 456;
        boolean result = new PalindromeNumber().isPalindrome(num);

        System.out.println(num + " is not a palindrome number");

        assertFalse(result);
    }

    @Test
    void testReverseInteger() {
        int num = 123;
        int result = new ReverseInteger().reverse(num);
        int expected = 321;

        System.out.println("Reverse of " + num + " is " + result);

        assertEquals(expected, result);
    }
}