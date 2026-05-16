package striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.hard.FlattenBinaryTreeToLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FlattenBinaryTreeToLinkedListTest {

    private final FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();

    @Test
    void test1() {
        Integer[] nodes = {1,2,5,3,4,null,6};
        Integer[] output = {1,null,2,null,3,null,4,null,5,null,6};

        TreeNode root = TreeUtils.construct(nodes);

        flattenBinaryTreeToLinkedList.flatten(root);

        Integer[] result = TreeUtils.toArray(root);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {};
        Integer[] output = {};

        TreeNode root = TreeUtils.construct(nodes);

        flattenBinaryTreeToLinkedList.flatten(root);

        Integer[] result = TreeUtils.toArray(root);

        assertArrayEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {0};
        Integer[] output = {0};

        TreeNode root = TreeUtils.construct(nodes);

        flattenBinaryTreeToLinkedList.flatten(root);

        Integer[] result = TreeUtils.toArray(root);

        assertArrayEquals(output, result);
    }

}