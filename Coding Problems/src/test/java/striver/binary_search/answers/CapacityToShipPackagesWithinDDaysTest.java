package striver.binary_search.answers;

import com.adnan.striver.binary_search.answers.CapacityToShipPackagesWithinDDays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapacityToShipPackagesWithinDDaysTest {

    @Test
    void test1() {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int output = 15;

        int result = new CapacityToShipPackagesWithinDDays().shipWithinDays(weights, days);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        int output = 6;

        int result = new CapacityToShipPackagesWithinDDays().shipWithinDays(weights, days);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] weights = {1,2,3,1,1};
        int days = 4;
        int output = 3;

        int result = new CapacityToShipPackagesWithinDDays().shipWithinDays(weights, days);

        assertEquals(output, result);
    }

}