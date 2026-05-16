package striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.hard.SerializeAndDeserializeBinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SerializeAndDeserializeBinaryTreeTest {

    private final SerializeAndDeserializeBinaryTree codec = new SerializeAndDeserializeBinaryTree();

    @Test
    void test1() {
        Integer[] nodes = {1,2,3,null,null,4,5};

        TreeNode root = TreeUtils.construct(nodes);
        TreeNode result = codec.deserialize(codec.serialize(root));

        assertArrayEquals(TreeUtils.toArray(root), TreeUtils.toArray(result));
    }

    @Test
    void test2() {
        Integer[] nodes = {};

        TreeNode root = TreeUtils.construct(nodes);
        TreeNode result = codec.deserialize(codec.serialize(root));

        assertArrayEquals(TreeUtils.toArray(root), TreeUtils.toArray(result));
    }

    @Test
    void test3() {
        Integer[] nodes = {4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2};

        TreeNode root = TreeUtils.construct(nodes);
        TreeNode result = codec.deserialize(codec.serialize(root));

        assertArrayEquals(TreeUtils.toArray(root), TreeUtils.toArray(result));
    }

}