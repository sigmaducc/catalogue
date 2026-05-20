package striver.binary_search_tree;

import com.adnan.striver.binary_search_tree.MaximumSumBstInBinaryTree;
import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumBstInBinaryTreeTest {

    private final MaximumSumBstInBinaryTree maximumSumBstInBinaryTree = new MaximumSumBstInBinaryTree();

    @Test
    void test1() {
        Integer[] nodes = {1,4,3,2,4,2,5,null,null,null,null,null,null,4,6};
        int output = 20;

        TreeNode root = TreeUtils.construct(nodes);

        int result = maximumSumBstInBinaryTree.maxSumBST(root);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {4,3,null,1,2};
        int output = 2;

        TreeNode root = TreeUtils.construct(nodes);

        int result = maximumSumBstInBinaryTree.maxSumBST(root);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {-4,-2,-5};
        int output = 0;

        TreeNode root = TreeUtils.construct(nodes);

        int result = maximumSumBstInBinaryTree.maxSumBST(root);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        Integer[] nodes = {4,8,null,6,1,9,null,-5,4,null,null,null,-3,null,10};
        int output = 14;

        TreeNode root = TreeUtils.construct(nodes);

        int result = maximumSumBstInBinaryTree.maxSumBST(root);

        assertEquals(output, result);
    }

}