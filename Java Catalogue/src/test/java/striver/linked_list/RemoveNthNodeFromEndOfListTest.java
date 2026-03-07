package striver.linked_list;

import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import com.adnan.striver.linked_list.RemoveNthNodeFromEndOfList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RemoveNthNodeFromEndOfListTest {

    private final RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();

    @Test
    void test1() {
        int[] nums = {1,2,3,4,5};
        int[] output = {1,2,3,5};
        int n = 2;

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test2() {
        int[] nums = {1};
        int[] output = {};
        int n = 1;

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test3() {
        int[] nums = {1,2};
        int[] output = {1};
        int n = 1;

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = removeNthNodeFromEndOfList.removeNthFromEnd(head, n);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

}