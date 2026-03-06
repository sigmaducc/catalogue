package striver.arrays.medium;

import com.adnan.striver.arrays.medium.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void test1() {
        int[] nums = {7,1,5,3,6,4};
        int output = 5;

        int result = bestTimeToBuyAndSellStock.maxProfit(nums);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {7,6,4,3,1};
        int output = 0;

        int result = bestTimeToBuyAndSellStock.maxProfit(nums);

        assertEquals(output, result);
    }

}