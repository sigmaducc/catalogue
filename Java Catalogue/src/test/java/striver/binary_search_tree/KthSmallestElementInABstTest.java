package striver.binary_search_tree;

import com.adnan.striver.binary_search_tree.KthSmallestElementInABst;
import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementInABstTest {

    private final KthSmallestElementInABst kthSmallestElementInABst = new KthSmallestElementInABst();

    @Test
    void test1() {
        Integer[] nodes = {3,1,4,null,2};
        int k = 1;
        int output = 1;

        TreeNode root = TreeUtils.construct(nodes);
        int result = kthSmallestElementInABst.kthSmallest(root, k);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {5,3,6,2,4,null,null,1};
        int k = 3;
        int output = 3;

        TreeNode root = TreeUtils.construct(nodes);
        int result = kthSmallestElementInABst.kthSmallest(root, k);

        assertEquals(output, result);
    }

}