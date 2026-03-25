package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.CheckIfBitIsSetOrNot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfBitIsSetOrNotTest {

    private final CheckIfBitIsSetOrNot checkIfBitIsSetOrNot = new CheckIfBitIsSetOrNot();

    @Test
    void test1() {
        int n = 5;
        int i = 0;

        boolean result = checkIfBitIsSetOrNot.check(n, i);

        assertTrue(result);
    }

    @Test
    void test2() {
        int n = 10;
        int i = 1;

        boolean result = checkIfBitIsSetOrNot.check(n, i);

        assertTrue(result);
    }

}