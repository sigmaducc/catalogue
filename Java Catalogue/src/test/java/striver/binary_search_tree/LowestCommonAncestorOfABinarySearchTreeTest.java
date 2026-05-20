package striver.binary_search_tree;

import com.adnan.striver.binary_search_tree.LowestCommonAncestorOfABinarySearchTree;
import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorOfABinarySearchTreeTest {

    private final LowestCommonAncestorOfABinarySearchTree lowestCommonAncestorOfABinarySearchTree = new LowestCommonAncestorOfABinarySearchTree();

    @Test
    void test1() {
        Integer[] nodes = {6,2,8,0,4,7,9,null,null,3,5};
        TreeNode root = TreeUtils.construct(nodes);

        TreeNode p = TreeUtils.find(root, 2);
        TreeNode q = TreeUtils.find(root, 8);
        TreeNode output = TreeUtils.find(root, 6);

        TreeNode result = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, p, q);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {6,2,8,0,4,7,9,null,null,3,5};
        TreeNode root = TreeUtils.construct(nodes);

        TreeNode p = TreeUtils.find(root, 2);
        TreeNode q = TreeUtils.find(root, 4);
        TreeNode output = TreeUtils.find(root, 2);

        TreeNode result = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, p, q);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {2,1};
        TreeNode root = TreeUtils.construct(nodes);

        TreeNode p = TreeUtils.find(root, 2);
        TreeNode q = TreeUtils.find(root, 1);
        TreeNode output = TreeUtils.find(root, 2);

        TreeNode result = lowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(root, p, q);

        assertEquals(output, result);
    }

}