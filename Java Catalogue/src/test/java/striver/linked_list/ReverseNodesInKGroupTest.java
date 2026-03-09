package striver.linked_list;

import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import com.adnan.striver.linked_list.ReverseNodesInKGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseNodesInKGroupTest {

    private final ReverseNodesInKGroup reverseNodesInKGroup = new ReverseNodesInKGroup();

    @Test
    void test1() {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        int[] output = {2,1,4,3,5};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = reverseNodesInKGroup.reverseKGroup(head, k);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test2() {
        int[] nums = {1,2,3,4,5};
        int k = 3;
        int[] output = {3,2,1,4,5};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = reverseNodesInKGroup.reverseKGroup(head, k);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

}