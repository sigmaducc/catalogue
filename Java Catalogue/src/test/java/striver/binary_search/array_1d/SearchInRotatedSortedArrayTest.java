package striver.binary_search.array_1d;

import com.adnan.striver.binary_search.array_1d.SearchInRotatedSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedSortedArrayTest {

    private final SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();

    @Test
    void test1() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int output = 4;

        int result = searchInRotatedSortedArray.search(nums, target);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int output = -1;

        int result = searchInRotatedSortedArray.search(nums, target);

        assertEquals(output, result);
    }

}