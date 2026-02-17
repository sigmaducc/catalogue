package striver.arrays.easy;

import com.adnan.striver.arrays.easy.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    @Test
    void test1() {
        int[] nums = {7,1,5,3,6,4};
        int output = 5;

        int result = new BestTimeToBuyAndSellStock().maxProfit(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {7,6,4,3,1};
        int output = 0;

        int result = new BestTimeToBuyAndSellStock().maxProfit(nums);

        assertEquals(output, result);
    }

}