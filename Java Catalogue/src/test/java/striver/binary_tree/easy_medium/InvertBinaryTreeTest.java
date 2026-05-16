package striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.easy_medium.InvertBinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InvertBinaryTreeTest {

    private final InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

    @Test
    void test1() {
        Integer[] nodes = {4,2,7,1,3,6,9};
        TreeNode root = TreeUtils.construct(nodes);
        Integer[] output = {4,7,2,9,6,3,1};

        TreeNode invertedRoot = invertBinaryTree.invertTree(root);
        Integer[] result = TreeUtils.toArray(invertedRoot);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {2,1,3};
        TreeNode root = TreeUtils.construct(nodes);
        Integer[] output = {2,3,1};

        TreeNode invertedRoot = invertBinaryTree.invertTree(root);
        Integer[] result = TreeUtils.toArray(invertedRoot);

        assertArrayEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {};
        TreeNode root = TreeUtils.construct(nodes);
        Integer[] output = {};

        TreeNode invertedRoot = invertBinaryTree.invertTree(root);
        Integer[] result = TreeUtils.toArray(invertedRoot);

        assertArrayEquals(output, result);
    }
}