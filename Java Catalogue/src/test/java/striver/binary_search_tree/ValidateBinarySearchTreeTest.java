package striver.binary_search_tree;

import com.adnan.striver.binary_search_tree.ValidateBinarySearchTree;
import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateBinarySearchTreeTest {

    private final ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

    @Test
    void test1() {
        Integer[] nodes = {2,1,3};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = validateBinarySearchTree.isValidBST(root);

        assertTrue(result);
    }

    @Test
    void test2() {
        Integer[] nodes = {5,1,4,null,null,3,6};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = validateBinarySearchTree.isValidBST(root);

        assertFalse(result);
    }

    @Test
    void test3() {
        Integer[] nodes = {2,2,2};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = validateBinarySearchTree.isValidBST(root);

        assertFalse(result);
    }

    @Test
    void test4() {
        Integer[] nodes = {5,4,6,null,null,3,7};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = validateBinarySearchTree.isValidBST(root);

        assertFalse(result);
    }

}