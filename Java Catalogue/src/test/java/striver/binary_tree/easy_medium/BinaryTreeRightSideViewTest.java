package striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.easy_medium.BinaryTreeRightSideView;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class BinaryTreeRightSideViewTest {

    private final BinaryTreeRightSideView binaryTreeRightSideView = new BinaryTreeRightSideView();

    @Test
    void test1() {
        Integer[] nodes = {1,2,3,null,5,null,4};
        TreeNode root = TreeUtils.construct(nodes);

        List<Integer> output = new ArrayList<>(
            List.of(1,3,4)
        );

        List<Integer> result = binaryTreeRightSideView.rightSideView(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {1,2,3,4,null,null,null,5};
        TreeNode root = TreeUtils.construct(nodes);

        List<Integer> output = new ArrayList<>(
            List.of(1,3,4,5)
        );

        List<Integer> result = binaryTreeRightSideView.rightSideView(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {1,null,3};
        TreeNode root = TreeUtils.construct(nodes);

        List<Integer> output = new ArrayList<>(
            List.of(1,3)
        );

        List<Integer> result = binaryTreeRightSideView.rightSideView(root);

        assertIterableEquals(output, result);
    }

    @Test
    void test4() {
        Integer[] nodes = {};
        TreeNode root = TreeUtils.construct(nodes);

        List<Integer> output = new ArrayList<>();

        List<Integer> result = binaryTreeRightSideView.rightSideView(root);

        assertIterableEquals(output, result);
    }

}