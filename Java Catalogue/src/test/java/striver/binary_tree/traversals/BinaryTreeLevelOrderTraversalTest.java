package striver.binary_tree.traversals;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.traversals.BinaryTreeLevelOrderTraversal;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class BinaryTreeLevelOrderTraversalTest {

    private final BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();

    @Test
    void test1() {
        Integer[] nums = {3,9,20,null,null,15,7};
        TreeNode root = TreeUtils.construct(nums);
        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(3),
                List.of(9,20),
                List.of(15,7)
            )
        );

        List<List<Integer>> result = binaryTreeLevelOrderTraversal.levelOrder(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nums = {1};
        TreeNode root = TreeUtils.construct(nums);
        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(1)
            )
        );

        List<List<Integer>> result = binaryTreeLevelOrderTraversal.levelOrder(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nums = {};
        TreeNode root = TreeUtils.construct(nums);
        List<List<Integer>> output = new ArrayList<>();

        List<List<Integer>> result = binaryTreeLevelOrderTraversal.levelOrder(root);

        assertIterableEquals(output, result);
    }
}