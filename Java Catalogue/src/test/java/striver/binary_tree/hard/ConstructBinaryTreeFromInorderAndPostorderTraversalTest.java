package striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.hard.ConstructBinaryTreeFromInorderAndPostorderTraversal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    private final ConstructBinaryTreeFromInorderAndPostorderTraversal constructBinaryTreeFromInorderAndPostorderTraversal = new ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @Test
    void test1() {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        Integer[] output = {3,9,20,null,null,15,7};

        TreeNode resultNode = constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(inorder, postorder);
        Integer[] result = TreeUtils.toArray(resultNode);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] inorder = {-1};
        int[] postorder = {-1};

        Integer[] output = {-1};

        TreeNode resultNode = constructBinaryTreeFromInorderAndPostorderTraversal.buildTree(inorder, postorder);
        Integer[] result = TreeUtils.toArray(resultNode);

        assertArrayEquals(output, result);
    }

}