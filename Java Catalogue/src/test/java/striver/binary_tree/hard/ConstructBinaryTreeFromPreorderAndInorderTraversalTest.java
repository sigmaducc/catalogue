package striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.hard.ConstructBinaryTreeFromPreorderAndInorderTraversal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    private final ConstructBinaryTreeFromPreorderAndInorderTraversal constructBinaryTreeFromPreorderAndInorderTraversal = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @Test
    void test1() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        Integer[] output = {3,9,20,null,null,15,7};

        TreeNode resultNode = constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);

        Integer[] result = TreeUtils.toArray(resultNode);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] preorder = {-1};
        int[] inorder = {-1};
        Integer[] output = {-1};

        TreeNode resultNode = constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(preorder, inorder);

        Integer[] result = TreeUtils.toArray(resultNode);

        assertArrayEquals(output, result);
    }

}