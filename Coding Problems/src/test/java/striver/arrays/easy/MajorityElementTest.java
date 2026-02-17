package striver.arrays.easy;

import com.adnan.striver.arrays.easy.MajorityElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    @Test
    void testMajorityElement1() {
        int[] nums = {3,3,4};
        int output = 3;

        int result = new MajorityElement().majorityElement(nums);

        assertEquals(output, result);
    }

    @Test
    void testMajorityElement2() {
        int[] nums = {2,2,1,1,1,2,2};
        int output = 2;

        int result = new MajorityElement().majorityElement(nums);

        assertEquals(output, result);
    }

}