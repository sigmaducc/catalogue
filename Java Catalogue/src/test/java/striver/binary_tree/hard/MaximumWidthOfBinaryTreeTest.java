package striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.hard.MaximumWidthOfBinaryTree;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MaximumWidthOfBinaryTreeTest {

    private final MaximumWidthOfBinaryTree maximumWidthOfBinaryTree = new MaximumWidthOfBinaryTree();

    @Test
    void test1() {
        Integer[] nodes = {1,3,2,5,3,null,9};
        TreeNode root = TreeUtils.construct(nodes);

        int output = 4;

        int result = maximumWidthOfBinaryTree.widthOfBinaryTree(root);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {1,3,2,5,null,null,9,6,null,7};
        TreeNode root = TreeUtils.construct(nodes);

        int output = 7;

        int result = maximumWidthOfBinaryTree.widthOfBinaryTree(root);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {1,3,2,5};
        TreeNode root = TreeUtils.construct(nodes);

        int output = 2;

        int result = maximumWidthOfBinaryTree.widthOfBinaryTree(root);

        assertEquals(output, result);
    }

}