package striver.basics.easy;

import com.adnan.striver.basics.easy.PalindromeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {

    @Test
    void testPalindromeNumber1() {
        int num = 121;
        boolean result = new PalindromeNumber().isPalindrome(num);

        assertTrue(result);
    }

    @Test
    void testPalindromeNumber2() {
        int num = -121;
        boolean result = new PalindromeNumber().isPalindrome(num);

        assertFalse(result);
    }

    @Test
    void testPalindromeNumber3() {
        int num = 10;
        boolean result = new PalindromeNumber().isPalindrome(num);

        assertFalse(result);
    }

}