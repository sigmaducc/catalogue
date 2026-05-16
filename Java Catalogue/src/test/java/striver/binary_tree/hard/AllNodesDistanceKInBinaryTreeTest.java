package striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.hard.AllNodesDistanceKInBinaryTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class AllNodesDistanceKInBinaryTreeTest {

    private final AllNodesDistanceKInBinaryTree allNodesDistanceKInBinaryTree = new AllNodesDistanceKInBinaryTree();

    @Test
    void test1() {
        Integer[] nodes = {3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = TreeUtils.construct(nodes);
        TreeNode target = TreeUtils.find(root, 5);
        int k = 2;

        List<Integer> output = new ArrayList<>(List.of(7,4,1));

        List<Integer> result = allNodesDistanceKInBinaryTree.distanceK(root, target, k);

        assertIterableEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {1};
        TreeNode root = TreeUtils.construct(nodes);
        TreeNode target = TreeUtils.find(root, 1);
        int k = 3;

        List<Integer> output = new ArrayList<>();

        List<Integer> result = allNodesDistanceKInBinaryTree.distanceK(root, target, k);

        assertIterableEquals(output, result);
    }

}