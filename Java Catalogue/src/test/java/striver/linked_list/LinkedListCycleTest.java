package striver.linked_list;

import com.adnan.striver.linked_list.LinkedListCycle;
import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycleTest {

    private final LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    void test1() {
        int[] nums = {3,2,0,-4};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head, true);
        LinkedListUtils.addCycle(head, 1);
        boolean result = linkedListCycle.hasCycle(head);

        assertTrue(result);
    }

    @Test
    void test2() {
        int[] nums = {1,2};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head, true);
        LinkedListUtils.addCycle(head, 0);
        boolean result = linkedListCycle.hasCycle(head);

        assertTrue(result);
    }

    @Test
    void test3() {
        int[] nums = {1};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head, true);
        LinkedListUtils.addCycle(head, -1);
        boolean result = linkedListCycle.hasCycle(head);

        assertFalse(result);
    }

}