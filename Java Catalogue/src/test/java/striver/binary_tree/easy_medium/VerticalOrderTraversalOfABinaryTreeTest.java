package striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.easy_medium.VerticalOrderTraversalOfABinaryTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class VerticalOrderTraversalOfABinaryTreeTest {

    private final VerticalOrderTraversalOfABinaryTree verticalOrderTraversalOfABinaryTree = new VerticalOrderTraversalOfABinaryTree();

    @Test
    void test1() {
        Integer[] nodes = {3,9,20,null,null,15,7};
        TreeNode root = TreeUtils.construct(nodes);

        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(9),
                List.of(3,15),
                List.of(20),
                List.of(7)
            )
        );

        List<List<Integer>> result = verticalOrderTraversalOfABinaryTree.verticalTraversal(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {1,2,3,4,5,6,7};
        TreeNode root = TreeUtils.construct(nodes);

        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(4),
                List.of(2),
                List.of(1,5,6),
                List.of(3),
                List.of(7)
            )
        );

        List<List<Integer>> result = verticalOrderTraversalOfABinaryTree.verticalTraversal(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {1,2,3,4,6,5,7};
        TreeNode root = TreeUtils.construct(nodes);

        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(4),
                List.of(2),
                List.of(1,5,6),
                List.of(3),
                List.of(7)
            )
        );

        List<List<Integer>> result = verticalOrderTraversalOfABinaryTree.verticalTraversal(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test4() {
        Integer[] nodes = {3,1,4,0,2,2};
        TreeNode root = TreeUtils.construct(nodes);

        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(0),
                List.of(1),
                List.of(3,2,2),
                List.of(4)
            )
        );

        List<List<Integer>> result = verticalOrderTraversalOfABinaryTree.verticalTraversal(root);

        assertIterableEquals(output, result);
    }

}