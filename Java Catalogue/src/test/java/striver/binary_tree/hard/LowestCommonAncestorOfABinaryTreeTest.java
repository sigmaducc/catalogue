package striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.hard.LowestCommonAncestorOfABinaryTree;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LowestCommonAncestorOfABinaryTreeTest {

    private final LowestCommonAncestorOfABinaryTree lowestCommonAncestorOfABinaryTree = new LowestCommonAncestorOfABinaryTree();

    @Test
    void test1() {
        Integer[] nodes = {3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = TreeUtils.construct(nodes);

        TreeNode p = TreeUtils.find(root, 5);
        TreeNode q = TreeUtils.find(root, 1);

        TreeNode output = TreeUtils.find(root, 3);
        TreeNode result = lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = TreeUtils.construct(nodes);

        TreeNode p = TreeUtils.find(root, 5);
        TreeNode q = TreeUtils.find(root, 4);

        TreeNode output = TreeUtils.find(root, 5);
        TreeNode result = lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {1,2};
        TreeNode root = TreeUtils.construct(nodes);

        TreeNode p = TreeUtils.find(root, 1);
        TreeNode q = TreeUtils.find(root, 2);

        TreeNode output = TreeUtils.find(root, 1);
        TreeNode result = lowestCommonAncestorOfABinaryTree.lowestCommonAncestor(root, p, q);

        assertEquals(output, result);
    }

}