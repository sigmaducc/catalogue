package striver.linked_list;

import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import com.adnan.striver.linked_list.MiddleOfTheLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MiddleOfTheLinkedListTest {

    private final MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

    @Test
    void test1() {
        int[] nums = {1,2,3,4,5};
        int[] output = {3,4,5};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = middleOfTheLinkedList.middleNode(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test2() {
        int[] nums = {1,2,3,4,5,6};
        int[] output = {4,5,6};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = middleOfTheLinkedList.middleNode(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

}