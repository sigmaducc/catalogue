package striver.linked_list;

import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import com.adnan.striver.linked_list.ReverseLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseLinkedListTest {

    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    void test1() {
        int[] nums = {1,2,3,4,5};
        int[] output = {5,4,3,2,1};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = reverseLinkedList.reverseList(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test2() {
        int[] nums = {1,2};
        int[] output = {2,1};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = reverseLinkedList.reverseList(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test3() {
        int[] nums = {};
        int[] output = {};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = reverseLinkedList.reverseList(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

}