package striver.binary_search.answers;

import com.adnan.striver.binary_search.answers.MinimumNumberOfDaysToMakeMBouquets;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumNumberOfDaysToMakeMBouquetsTest {

    @Test
    void test1() {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3; int k = 1;
        int output = 3;
        int result = new MinimumNumberOfDaysToMakeMBouquets().minDays(bloomDay, m, k);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3; int k = 2;
        int output = -1;
        int result = new MinimumNumberOfDaysToMakeMBouquets().minDays(bloomDay, m, k);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2; int k = 3;
        int output = 12;
        int result = new MinimumNumberOfDaysToMakeMBouquets().minDays(bloomDay, m, k);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        int[] bloomDay = {1000000000,1000000000};
        int m = 1; int k = 1;
        int output = 1000000000;
        int result = new MinimumNumberOfDaysToMakeMBouquets().minDays(bloomDay, m, k);

        assertEquals(output, result);
    }

}