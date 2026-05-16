package striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.easy_medium.SymmetricTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricTreeTest {

    private final SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    void test1() {
        Integer[] nodes = {1,2,2,3,4,4,3};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = symmetricTree.isSymmetric(root);

        assertTrue(result);
    }

    @Test
    void test2() {
        Integer[] nodes = {1,2,2,null,3,null,3};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = symmetricTree.isSymmetric(root);

        assertFalse(result);
    }

    @Test
    void test3() {
        Integer[] nodes = {9,-42,-42,null,76,76,null,null,13,null,13};
        TreeNode root = TreeUtils.construct(nodes);

        boolean result = symmetricTree.isSymmetric(root);

        assertFalse(result);
    }

}