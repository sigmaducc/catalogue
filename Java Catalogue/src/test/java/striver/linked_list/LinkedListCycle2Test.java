package striver.linked_list;

import com.adnan.striver.linked_list.LinkedListCycle2;
import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListCycle2Test {

    private final LinkedListCycle2 linkedListCycle2 = new LinkedListCycle2();

    @Test
    void test1() {
        int[] nums = {3,2,0,-4};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        ListNode cycleNode = LinkedListUtils.addCycle(head, 1);
        ListNode result = linkedListCycle2.detectCycle(head);
        System.out.println(linkedListCycle2.loopLength(head));

        assertEquals(cycleNode, result);
    }

    @Test
    void test2() {
        int[] nums = {1,2};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        ListNode cycleNode = LinkedListUtils.addCycle(head, 0);
        ListNode result = linkedListCycle2.detectCycle(head);
        System.out.println(linkedListCycle2.loopLength(head));

        assertEquals(cycleNode, result);
    }

    @Test
    void test3() {
        int[] nums = {1};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        ListNode cycleNode = LinkedListUtils.addCycle(head, -1);
        ListNode result = linkedListCycle2.detectCycle(head);
        System.out.println(linkedListCycle2.loopLength(head));

        assertEquals(cycleNode, result);
    }

    @Test
    void test4() {
        int[] nums = {1,2,3,4};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        ListNode cycleNode = LinkedListUtils.addCycle(head, 0);
        ListNode result = linkedListCycle2.detectCycle(head);
        System.out.println(linkedListCycle2.loopLength(head));

        assertEquals(cycleNode, result);
    }

}