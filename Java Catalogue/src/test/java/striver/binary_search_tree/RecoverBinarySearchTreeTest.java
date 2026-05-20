package striver.binary_search_tree;

import com.adnan.striver.binary_search_tree.RecoverBinarySearchTree;
import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RecoverBinarySearchTreeTest {

    private final RecoverBinarySearchTree recoverBinarySearchTree = new RecoverBinarySearchTree();

    @Test
    void test1() {
        Integer[] nodes = {1,3,null,null,2};
        Integer[] output = {3,1,null,null,2};

        TreeNode root = TreeUtils.construct(nodes);
        recoverBinarySearchTree.recoverTree(root);
        Integer[] result = TreeUtils.toArray(root);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {3,1,4,null,null,2};
        Integer[] output = {2,1,4,null,null,3};

        TreeNode root = TreeUtils.construct(nodes);
        recoverBinarySearchTree.recoverTree(root);
        Integer[] result = TreeUtils.toArray(root);

        assertArrayEquals(output, result);
    }

}