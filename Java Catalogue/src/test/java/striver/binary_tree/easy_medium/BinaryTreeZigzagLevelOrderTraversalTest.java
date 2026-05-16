package striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.easy_medium.BinaryTreeZigzagLevelOrderTraversal;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class BinaryTreeZigzagLevelOrderTraversalTest {

    private final BinaryTreeZigzagLevelOrderTraversal binaryTreeZigzagLevelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal();

    @Test
    void test1() {
        Integer[] nodes = {3,9,20,null,null,15,7};
        TreeNode root = TreeUtils.construct(nodes);

        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(3),
                List.of(20,9),
                List.of(15,7)
            )
        );

        List<List<Integer>> result = binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {1};
        TreeNode root = TreeUtils.construct(nodes);

        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(1)
            )
        );

        List<List<Integer>> result = binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {};
        TreeNode root = TreeUtils.construct(nodes);

        List<List<Integer>> output = new ArrayList<>();

        List<List<Integer>> result = binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test4() {
        Integer[] nodes = {1,2,3,4,null,null,5};
        TreeNode root = TreeUtils.construct(nodes);

        List<List<Integer>> output = new ArrayList<>(
            List.of(
                List.of(1),
                List.of(3,2),
                List.of(4,5)
            )
        );

        List<List<Integer>> result = binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

        assertIterableEquals(output, result);
    }
}