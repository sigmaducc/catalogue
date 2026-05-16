package striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import com.adnan.striver.binary_tree.hard.CountCompleteTreeNodes;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CountCompleteTreeNodesTest {

    private final CountCompleteTreeNodes countCompleteTreeNodes = new CountCompleteTreeNodes();

    @Test
    void test1() {
        Integer[] nodes = {1,2,3,4,5,6};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 6;

        int result = countCompleteTreeNodes.countNodes(root);

        assertEquals(output, result);
    }

    @Test
    void test2() {
        Integer[] nodes = {};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 0;

        int result = countCompleteTreeNodes.countNodes(root);

        assertEquals(output, result);
    }

    @Test
    void test3() {
        Integer[] nodes = {1};
        TreeNode root = TreeUtils.construct(nodes);
        int output = 1;

        int result = countCompleteTreeNodes.countNodes(root);

        assertEquals(output, result);
    }

}