package striver.binary_search_tree;

import com.adnan.striver.binary_search_tree.DeleteNodeInABst;
import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DeleteNodeInABstTest {

    private final DeleteNodeInABst deleteNodeInABst = new DeleteNodeInABst();

    @Test
    void test1() {
        Integer[] nodes = {5,3,6,2,4,null,7};
        Integer[] outputNodes = {5,4,6,2,null,null,7};
        int val = 3;

        TreeNode root = TreeUtils.construct(nodes);
        TreeNode outputNode = TreeUtils.construct(outputNodes);
        TreeNode resultNode = deleteNodeInABst.deleteNode(root, val);

        assertArrayEquals(TreeUtils.sort(outputNode), TreeUtils.sort(resultNode));
    }

    @Test
    void test2() {
        Integer[] nodes = {5,3,6,2,4,null,7};
        Integer[] outputNodes = {5,3,6,2,4,null,7};
        int val = 0;

        TreeNode root = TreeUtils.construct(nodes);
        TreeNode outputNode = TreeUtils.construct(outputNodes);
        TreeNode resultNode = deleteNodeInABst.deleteNode(root, val);

        assertArrayEquals(TreeUtils.sort(outputNode), TreeUtils.sort(resultNode));
    }

    @Test
    void test3() {
        Integer[] nodes = {};
        Integer[] outputNodes = {};
        int val = 0;

        TreeNode root = TreeUtils.construct(nodes);
        TreeNode outputNode = TreeUtils.construct(outputNodes);
        TreeNode resultNode = deleteNodeInABst.deleteNode(root, val);

        assertArrayEquals(TreeUtils.sort(outputNode), TreeUtils.sort(resultNode));
    }

}