package striver.bit_manipulation;

import com.adnan.striver.bit_manipulation.Subsets;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class SubsetsTest {

    private final Subsets subsets = new Subsets();

    @Test
    void test1() {
        int[] nums = {1,2,3};
        List<List<Integer>> output = new ArrayList<>(
                List.of(
                        List.of(),
                        List.of(1),
                        List.of(2),
                        List.of(1,2),
                        List.of(3),
                        List.of(1,3),
                        List.of(2,3),
                        List.of(1,2,3)
                )
        );

        List<List<Integer>> result = subsets.subsets(nums);

        output.sort(Comparator.comparing(list -> list.size()));
        result.sort(Comparator.comparing(list -> list.size()));

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {0};
        List<List<Integer>> output = new ArrayList<>(
                List.of(
                        List.of(),
                        List.of(0)
                )
        );

        List<List<Integer>> result = subsets.subsets(nums);

        output.sort(Comparator.comparing(list -> list.size()));
        result.sort(Comparator.comparing(list -> list.size()));

        assertIterableEquals(output, result);
    }

}