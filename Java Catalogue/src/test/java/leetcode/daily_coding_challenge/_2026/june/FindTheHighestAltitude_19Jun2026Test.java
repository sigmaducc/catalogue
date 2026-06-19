package leetcode.daily_coding_challenge._2026.june;

import com.adnan.leetcode.daily_coding_challenge._2026.june.FindTheHighestAltitude_19Jun2026;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheHighestAltitude_19Jun2026Test {

    private final FindTheHighestAltitude_19Jun2026 findTheHighestAltitude = new FindTheHighestAltitude_19Jun2026();

    @Test
    void test1() {
        int[] gain = {-5,1,5,0,-7};
        int output = 1;

        int result = findTheHighestAltitude.largestAltitude(gain);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int output = 0;

        int result = findTheHighestAltitude.largestAltitude(gain);

        assertEquals(output, result);
    }
}