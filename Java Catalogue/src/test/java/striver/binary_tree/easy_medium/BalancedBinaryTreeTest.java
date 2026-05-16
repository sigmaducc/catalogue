package striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.easy_medium.BalancedBinaryTree;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class BalancedBinaryTreeTest {

    private final BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    void test1() {
        Integer[] nodes = {3,9,20,null,null,15,7};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = balancedBinaryTree.isBalanced(root);

        assertTrue(result);
    }

    @Test
    void test2() {
        Integer[] nodes = {1,2,2,3,3,null,null,4,4};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = balancedBinaryTree.isBalanced(root);

        assertFalse(result);
    }

    @Test
    void test3() {
        Integer[] nodes = {};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = balancedBinaryTree.isBalanced(root);

        assertTrue(result);
    }

    @Test
    void test4() {
        Integer[] nodes = {1,2,2,3,null,null,3,4,null,null,4};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = balancedBinaryTree.isBalanced(root);

        assertFalse(result);
    }

}