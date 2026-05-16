package striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.easy_medium.BinaryTreeMaximumPathSum;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class BinaryTreeMaximumPathSumTest {

    private final BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();

    @Test
    void test1() {
        Integer[] nodes = {1,2,3};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 6;

        int result = binaryTreeMaximumPathSum.maxPathSum(root);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {-10,9,20,null,null,15,7};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 42;

        int result = binaryTreeMaximumPathSum.maxPathSum(root);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {-3};
        TreeNode root = TreeUtils.construct(nodes);
        int output = -3;

        int result = binaryTreeMaximumPathSum.maxPathSum(root);

        assertEquals(output, result);
    }

    @Test
    void test4() {
        Integer[] nodes = {2,-1};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 2;

        int result = binaryTreeMaximumPathSum.maxPathSum(root);

        assertEquals(output, result);
    }

    @Test
    void test5() {
        Integer[] nodes = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 48;

        int result = binaryTreeMaximumPathSum.maxPathSum(root);

        assertEquals(output, result);
    }

}