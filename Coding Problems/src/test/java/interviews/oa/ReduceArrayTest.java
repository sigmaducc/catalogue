package interviews.oa;

import com.adnan.interviews.oa.ReduceArray;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReduceArrayTest {

    @Test
    void test1() {
        List<Integer> nums = new ArrayList<>(List.of(2, 3, 4, 5, 7));
        int output = 8;

        int result = new ReduceArray().totalCost(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        List<Integer> nums = new ArrayList<>();
        int output = 199998;

        for(int i = 1; i <= 100_000; i++) {
            nums.add(i);
        }

        int result = new ReduceArray().totalCost(nums);

        assertEquals(output, result);
    }

}