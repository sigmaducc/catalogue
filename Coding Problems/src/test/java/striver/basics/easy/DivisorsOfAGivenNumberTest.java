package striver.basics.easy;

import com.adnan.striver.basics.easy.DivisorsOfAGivenNumber;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DivisorsOfAGivenNumberTest {

    @Test
    void test1() {
        int n = 12;
        List<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 12));

        Collections.sort(output);
        List<Integer> result = new DivisorsOfAGivenNumber().getAllDivisors(n);
        Collections.sort(result);

        assertArrayEquals(output.toArray(), result.toArray());
    }

    @Test
    void test2() {
        int n = 36;
        List<Integer> output = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 9, 12, 18, 36));

        Collections.sort(output);
        List<Integer> result = new DivisorsOfAGivenNumber().getAllDivisors(n);
        Collections.sort(result);

        assertArrayEquals(output.toArray(), result.toArray());
    }

}