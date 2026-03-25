package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.CheckIfANumberIsOddOrNot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfANumberIsOddOrNotTest {

    private final CheckIfANumberIsOddOrNot checkIfANumberIsOddOrNot = new CheckIfANumberIsOddOrNot();

    @Test
    void test1() {
        int n = 7;

        boolean result = checkIfANumberIsOddOrNot.check(n);

        assertTrue(result);
    }

    @Test
    void test2() {
        int n = 10;

        boolean result = checkIfANumberIsOddOrNot.check(n);

        assertFalse(result);
    }
}