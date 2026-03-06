package ds;

import com.adnan.ds.linked_list.doubly.DoublyLinkedList;
import com.adnan.ds.linked_list.doubly.Node;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

    DoublyLinkedList linkedList = new DoublyLinkedList();
    int[] nums = {1,2,3,5,6};

    @Test
    void Construct() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.print(head);
    }

    @Test
    void DeleteHead() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.print(head);
        head = linkedList.deleteHead(head);
        linkedList.print(head);
    }

    @Test
    void DeleteTail() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.print(head);
        head = linkedList.deleteTail(head);
        linkedList.print(head);
    }

    @Test
    void DeleteElementAt() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.print(head);
        head = linkedList.deleteAt(head, 3);
        linkedList.print(head);
        head = linkedList.deleteAt(head, 1);
        linkedList.print(head);
        head = linkedList.deleteAt(head, 3);
        linkedList.print(head);
        head = linkedList.deleteAt(head, 8);
        linkedList.print(head);
    }

}