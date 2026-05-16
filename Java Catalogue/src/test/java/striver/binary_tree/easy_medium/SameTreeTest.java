package striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.easy_medium.SameTree;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class SameTreeTest {

    private final SameTree sameTree = new SameTree();

    @Test
    void test1() {
        Integer[] nodes1 = {1,2,3};
        Integer[] nodes2 = {1,2,3};

        TreeNode root1 = TreeUtils.construct(nodes1);
        TreeNode root2 = TreeUtils.construct(nodes2);

        boolean result = sameTree.isSameTree(root1, root2);

        assertTrue(result);
    }

    @Test
    void test2() {
        Integer[] nodes1 = {1,2,1};
        Integer[] nodes2 = {1,1,2};

        TreeNode root1 = TreeUtils.construct(nodes1);
        TreeNode root2 = TreeUtils.construct(nodes2);

        boolean result = sameTree.isSameTree(root1, root2);

        assertFalse(result);
    }

}