package striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.easy_medium.MaximumDepthOfBinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    void test1() {
        Integer[] nodes = {3,9,20,null,null,15,7};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 3;

        int result = maximumDepthOfBinaryTree.maxDepth(root);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {1,null,2};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 2;

        int result = maximumDepthOfBinaryTree.maxDepth(root);

        assertEquals(output, result);
    }

}