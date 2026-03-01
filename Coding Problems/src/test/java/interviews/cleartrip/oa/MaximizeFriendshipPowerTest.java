package interviews.cleartrip.oa;

import com.adnan.interviews.cleartrip.oa.MaximizeFriendshipPower;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximizeFriendshipPowerTest {

    @Test
    void test1() {
        int N = 5;
        int M = 3;
        int[] A = {2,2,3,2,5};
        int[][] roads = {{1,2}, {1,3},{4,5}};
        int output = 51;

        int result = new MaximizeFriendshipPower().maximizeFriendshipPower(N, M, roads, A);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int N = 4;
        int M = 2;
        int[] A = {6, 2, 3, 1};
        int[][] roads = {{1,3}, {2,4}};
        int output = 39;

        int result = new MaximizeFriendshipPower().maximizeFriendshipPower(N, M, roads, A);

        assertEquals(output, result);
    }

}