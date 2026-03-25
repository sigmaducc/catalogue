package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.SwapTwoNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapTwoNumbersTest {

    private final SwapTwoNumbers swapTwoNumbers = new SwapTwoNumbers();

    @Test
    void test1() {
        int[] arr = {5, 10};
        int[] output = {10, 5};

        swapTwoNumbers.swap(arr);

        assertArrayEquals(output, arr);
    }

    @Test
    void test2() {
        int[] arr = {-100, -200};
        int[] output = {-200, -100};

        swapTwoNumbers.swap(arr);

        assertArrayEquals(output, arr);
    }

}