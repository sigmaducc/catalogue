package striver.binary_search_tree;

import com.adnan.striver.binary_search_tree.BinarySearchTreeIterator;
import com.adnan.striver.binary_tree.TreeNode;
import com.adnan.striver.binary_tree.TreeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeIteratorTest {

    private BinarySearchTreeIterator binarySearchTreeIterator;

    @Test
    void test1() {
        String[] operations = {"BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", "hasNext", "next", "hasNext"};
        Object[] output = {null, 3, 7, true, 9, true, 15, true, 20, false};

        for(int i = 0; i < operations.length; i++) {
            String operation = operations[i];
            switch(operation) {
                case "BSTIterator":
                    Integer[] nodes = {7, 3, 15, null, null, 9, 20};
                    TreeNode root = TreeUtils.construct(nodes);
                    binarySearchTreeIterator = new BinarySearchTreeIterator(root);
                    break;
                case "hasNext":
                    boolean hasNext = binarySearchTreeIterator.hasNext();
                    assertEquals(output[i], hasNext);
                    break;
                case "next":
                    int next = binarySearchTreeIterator.next();
                    assertEquals(output[i], next);
                    break;
            }
        }
    }

}