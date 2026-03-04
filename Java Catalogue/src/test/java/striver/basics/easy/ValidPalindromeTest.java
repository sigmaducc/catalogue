package striver.basics.easy;

import com.adnan.striver.basics.easy.ValidPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {

    @Test
    void testValidPalindrome1() {
        String str = "A man, a plan, a canal: Panama";
        boolean result = new ValidPalindrome().isPalindrome(str);

        assertTrue(result);
    }

    @Test
    void testValidPalindrome2() {
        String str = "race a car";
        boolean result = new ValidPalindrome().isPalindrome(str);

        assertFalse(result);
    }

    @Test
    void testValidPalindrome3() {
        String str = " ";
        boolean result = new ValidPalindrome().isPalindrome(str);

        assertTrue(result);
    }

    @Test
    void testValidPalindrome4() {
        String str = "0P";
        boolean result = new ValidPalindrome().isPalindrome(str);

        assertFalse(result);
    }

}