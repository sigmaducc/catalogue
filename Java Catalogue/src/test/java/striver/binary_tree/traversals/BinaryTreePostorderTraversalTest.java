package striver.binary_tree.traversals;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.traversals.BinaryTreePostorderTraversal;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class BinaryTreePostorderTraversalTest {

    private final BinaryTreePostorderTraversal binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();

    @Test
    void test1() {
        Integer[] nums = {1,null,2,3};
        List<Integer> output = new ArrayList<>(List.of(3,2,1));

        TreeNode root = TreeUtils.construct(nums);
        List<Integer> result = binaryTreePostorderTraversal.postorderTraversal(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nums = {1,2,3,4,5,null,8,null,null,6,7,9};
        List<Integer> output = new ArrayList<>(List.of(4,6,7,5,2,9,8,3,1));

        TreeNode root = TreeUtils.construct(nums);
        List<Integer> result = binaryTreePostorderTraversal.postorderTraversal(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nums = {};
        List<Integer> output = new ArrayList<>();

        TreeNode root = TreeUtils.construct(nums);
        List<Integer> result = binaryTreePostorderTraversal.postorderTraversal(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test4() {
        Integer[] nums = {1};
        List<Integer> output = new ArrayList<>(List.of(1));

        TreeNode root = TreeUtils.construct(nums);
        List<Integer> result = binaryTreePostorderTraversal.postorderTraversal(root);

        assertIterableEquals(output, result);
    }
}