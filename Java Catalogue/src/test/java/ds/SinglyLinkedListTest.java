package ds;

import com.adnan.ds.linked_list.singly.Node;
import com.adnan.ds.linked_list.singly.SinglyLinkedList;
import org.junit.jupiter.api.Test;

public class SinglyLinkedListTest {

    private final int[] nums = {1,2,3,5,6};
    private final SinglyLinkedList linkedList = new SinglyLinkedList();

    @Test
    void Traverse() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.traverse(head);
        linkedList.print(head);
    }

    @Test
    void HasElement() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.traverse(head);
        System.out.println(linkedList.hasElement(head, 4));
        System.out.println(linkedList.hasElement(head, 5));
        linkedList.print(head);
    }

    @Test
    void DeleteHead() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.traverse(head);
        head = linkedList.deleteHead(head);
        linkedList.traverse(head);
        linkedList.print(head);
    }

    @Test
    void DeleteTail() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.traverse(head);
        head = linkedList.deleteTail(head);
        linkedList.traverse(head);
        linkedList.print(head);
    }

    @Test
    void DeleteAt() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.traverse(head);
        head = linkedList.deleteAt(head, 3);
        linkedList.traverse(head);
        head = linkedList.deleteAt(head, 2);
        linkedList.traverse(head);
        head = linkedList.deleteAt(head, 12);
        linkedList.traverse(head);
        linkedList.print(head);
    }

    @Test
    void DeleteElement() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.traverse(head);
        head = linkedList.deleteElement(head, 3);
        linkedList.traverse(head);
        head = linkedList.deleteElement(head, 5);
        linkedList.traverse(head);
        head = linkedList.deleteElement(head, 12);
        linkedList.traverse(head);
        linkedList.print(head);
    }

    @Test
    void InsertElementAtHead() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.traverse(head);
        head = linkedList.insertAtHead(head, 9);
        linkedList.traverse(head);
        head = linkedList.insertAtHead(head, 9);
        linkedList.traverse(head);
        head = linkedList.insertAtHead(head, 8);
        linkedList.traverse(head);
        head = linkedList.insertAtHead(head, 7);
        linkedList.traverse(head);
        linkedList.print(head);
    }

    @Test
    void InsertElementAtTail() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.traverse(head);
        head = linkedList.insertAtTail(head, 9);
        linkedList.traverse(head);
        head = linkedList.insertAtTail(head, 9);
        linkedList.traverse(head);
        head = linkedList.insertAtTail(head, 8);
        linkedList.traverse(head);
        head = linkedList.insertAtTail(head, 7);
        linkedList.traverse(head);
        linkedList.print(head);
    }

    @Test
    void InsertElementAt() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.traverse(head);
        head = linkedList.insertAt(head, 9, 1);
        linkedList.traverse(head);
        head = linkedList.insertAt(head, 9, 3);
        linkedList.traverse(head);
        head = linkedList.insertAt(head, 4, 8);
        linkedList.traverse(head);
        head = linkedList.insertAt(head, 7, 5);
        linkedList.traverse(head);
        linkedList.print(head);
    }

    @Test
    void InsertBeforeValue() {
        Node<Integer> head = linkedList.construct(nums);
        linkedList.traverse(head);
        head = linkedList.insertBeforeValue(head, 9, 1);
        linkedList.traverse(head);
        head = linkedList.insertBeforeValue(head, 8, 5);
        linkedList.traverse(head);
        head = linkedList.insertBeforeValue(head, 4, 2);
        linkedList.traverse(head);
        head = linkedList.insertBeforeValue(head, 7, 6);
        linkedList.traverse(head);
        linkedList.print(head);
    }

}