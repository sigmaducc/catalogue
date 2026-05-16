package striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.easy_medium.DiameterOfBinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiameterOfBinaryTreeTest {

    private final DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

    @Test
    void test1() {
        Integer[] nodes = {1,2,3,4,5};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 3;

        int result = diameterOfBinaryTree.diameterOfBinaryTree(root);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {1,2};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 1;

        int result = diameterOfBinaryTree.diameterOfBinaryTree(root);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {1};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 0;

        int result = diameterOfBinaryTree.diameterOfBinaryTree(root);

        assertEquals(output, result);
    }

}