package striver.binary_search_tree;

import com.adnan.striver.binary_search_tree.ConstructBinarySearchTreeFromPreorderTraversal;
import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConstructBinarySearchTreeFromPreorderTraversalTest {

    private final ConstructBinarySearchTreeFromPreorderTraversal constructBinarySearchTreeFromPreorderTraversal = new ConstructBinarySearchTreeFromPreorderTraversal();

    @Test
    void test1() {
        int[] preorder = {8,5,1,7,10,12};
        Integer[] outputNodes = {8,5,10,1,7,null,12};

        TreeNode outputRoot = TreeUtils.construct(outputNodes);
        Integer[] output = TreeUtils.toArray(outputRoot);
        TreeNode resultNode = constructBinarySearchTreeFromPreorderTraversal.bstFromPreorder(preorder);
        Integer[] result = TreeUtils.toArray(resultNode);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[] preorder = {1,3};
        Integer[] outputNodes = {1,null,3};

        TreeNode outputRoot = TreeUtils.construct(outputNodes);
        Integer[] output = TreeUtils.toArray(outputRoot);
        TreeNode resultNode = constructBinarySearchTreeFromPreorderTraversal.bstFromPreorder(preorder);
        Integer[] result = TreeUtils.toArray(resultNode);

        assertArrayEquals(output, result);
    }

}