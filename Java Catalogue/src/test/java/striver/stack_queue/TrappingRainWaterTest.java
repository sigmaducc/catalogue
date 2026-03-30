package striver.stack_queue;

import com.adnan.striver.stack_queue.TrappingRainWater;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrappingRainWaterTest {

    private final TrappingRainWater trappingRainWater = new TrappingRainWater();

    @Test
    void test1() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int output = 6;

        int result = trappingRainWater.trap(height);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] height = {4,2,0,3,2,5};
        int output = 9;

        int result = trappingRainWater.trap(height);

        assertEquals(output, result);
    }

}