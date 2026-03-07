package striver.linked_list;

import com.adnan.striver.linked_list.DeleteTheMiddleNodeOfALinkedList;
import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DeleteTheMiddleNodeOfALinkedListTest {

    private final DeleteTheMiddleNodeOfALinkedList deleteTheMiddleNodeOfALinkedList = new DeleteTheMiddleNodeOfALinkedList();

    @Test
    void test1() {
        int[] nums = {1,3,4,7,1,2,6};
        int[] output = {1,3,4,1,2,6};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = deleteTheMiddleNodeOfALinkedList.deleteMiddle(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test2() {
        int[] nums = {1,2,3,4};
        int[] output = {1,2,4};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = deleteTheMiddleNodeOfALinkedList.deleteMiddle(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test3() {
        int[] nums = {2,1};
        int[] output = {2};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = deleteTheMiddleNodeOfALinkedList.deleteMiddle(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test4() {
        int[] nums = {1};
        int[] output = {};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = deleteTheMiddleNodeOfALinkedList.deleteMiddle(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

}