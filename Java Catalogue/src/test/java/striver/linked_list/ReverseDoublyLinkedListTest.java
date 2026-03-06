package striver.linked_list;

import com.adnan.ds.linked_list.doubly.DoublyLinkedList;
import com.adnan.ds.linked_list.doubly.Node;
import com.adnan.striver.linked_list.ReverseDoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseDoublyLinkedListTest {

    private final DoublyLinkedList linkedList = new DoublyLinkedList();
    private final ReverseDoublyLinkedList reverseDoublyLinkedList = new ReverseDoublyLinkedList();

    @Test
    void test1() {
        int[] nums = {1,2,3,4};
        int[] output = {4,3,2,1};

        Node<Integer> head = linkedList.construct(nums);
        linkedList.print(head);
        head = reverseDoublyLinkedList.reverse(head);
        linkedList.print(head);

        assertArrayEquals(output, linkedList.toArray(head));
    }

    @Test
    void test2() {
        int[] nums = {10,20,30};
        int[] output = {30,20,10};

        Node<Integer> head = linkedList.construct(nums);
        linkedList.print(head);
        head = reverseDoublyLinkedList.reverse(head);
        linkedList.print(head);

        assertArrayEquals(output, linkedList.toArray(head));
    }

}