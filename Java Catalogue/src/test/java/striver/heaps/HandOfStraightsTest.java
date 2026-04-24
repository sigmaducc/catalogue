package striver.heaps;

import com.adnan.striver.heaps.HandOfStraights;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HandOfStraightsTest {

    private final HandOfStraights handOfStraights = new HandOfStraights();

    @Test
    void test1() {
        int[] hands = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;

        boolean result = handOfStraights.isNStraightHand(hands, groupSize);

        assertTrue(result);
    }

    @Test
    void test2() {
        int[] hands = {1,2,3,4,5};
        int groupSize = 4;

        boolean result = handOfStraights.isNStraightHand(hands, groupSize);

        assertFalse(result);
    }
}