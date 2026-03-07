package striver.linked_list;

import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import com.adnan.striver.linked_list.OddEvenLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class OddEvenLinkedListTest {

    private final OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

    @Test
    void test1() {
        int[] nums = {1,2,3,4,5};
        int[] output = {1,3,5,2,4};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = oddEvenLinkedList.oddEvenList(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test2() {
        int[] nums = {2,1,3,5,6,4,7};
        int[] output = {2,3,6,7,1,5,4};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = oddEvenLinkedList.oddEvenList(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test3() {
        int[] nums = {};
        int[] output = {};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = oddEvenLinkedList.oddEvenList(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

}