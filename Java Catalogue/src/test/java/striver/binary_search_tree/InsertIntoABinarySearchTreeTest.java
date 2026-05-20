package striver.binary_search_tree;

import com.adnan.striver.binary_search_tree.InsertIntoABinarySearchTree;
import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertIntoABinarySearchTreeTest {

    private final InsertIntoABinarySearchTree insertIntoABinarySearchTree = new InsertIntoABinarySearchTree();

    @Test
    void test1() {
        Integer[] nodes = {4,2,7,1,3};
        Integer[] outputNodes = {4,2,7,1,3,5};
        int val = 5;

        TreeNode root = TreeUtils.construct(nodes);
        TreeNode outputNode = TreeUtils.construct(outputNodes);
        TreeNode resultNode = insertIntoABinarySearchTree.insertIntoBST(root, val);

        assertArrayEquals(TreeUtils.sort(outputNode), TreeUtils.sort(resultNode));
    }

    @Test
    void test2() {
        Integer[] nodes = {40,20,60,10,30,50,70};
        Integer[] outputNodes = {40,20,60,10,30,50,70,null,null,25};
        int val = 25;

        TreeNode root = TreeUtils.construct(nodes);
        TreeNode outputNode = TreeUtils.construct(outputNodes);
        TreeNode resultNode = insertIntoABinarySearchTree.insertIntoBST(root, val);

        assertArrayEquals(TreeUtils.sort(outputNode), TreeUtils.sort(resultNode));
    }

    @Test
    void test3() {
        Integer[] nodes = {4,2,7,1,3,null,null,null,null,null,null};
        Integer[] outputNodes = {4,2,7,1,3,5};
        int val = 5;

        TreeNode root = TreeUtils.construct(nodes);
        TreeNode outputNode = TreeUtils.construct(outputNodes);
        TreeNode resultNode = insertIntoABinarySearchTree.insertIntoBST(root, val);

        assertArrayEquals(TreeUtils.sort(outputNode), TreeUtils.sort(resultNode));
    }

}