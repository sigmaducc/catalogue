package striver.binary_search_tree;

import com.adnan.striver.binary_search_tree.TwoSum4;
import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoSum4Test {

    private final TwoSum4 twoSum4 = new TwoSum4();

    @Test
    void test1() {
        Integer[] nodes = {5,3,6,2,4,null,7};
        int k = 9;

        TreeNode root = TreeUtils.construct(nodes);

        boolean result = twoSum4.findTarget(root, k);

        assertTrue(result);
    }

    @Test
    void test2() {
        Integer[] nodes = {5,3,6,2,4,null,7};
        int k = 28;

        TreeNode root = TreeUtils.construct(nodes);

        boolean result = twoSum4.findTarget(root, k);

        assertFalse(result);
    }
}