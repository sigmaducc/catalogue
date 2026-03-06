package com.adnan.striver.linked_list;

import com.adnan.ds.linked_list.doubly.Node;

// Non LeetCode question (but from striver sheet)

public class ReverseDoublyLinkedList {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public Node<Integer> reverse(Node<Integer> head) {
        Node<Integer> curr = head;
        while(curr != null) {
            swap(curr);
            head = curr;
            curr = curr.getPrev();
        }

        return head;
    }

    private void swap(Node<Integer> node) {
        Node<Integer> temp = node.getPrev();
        node.setPrev(node.getNext());
        node.setNext(temp);
    }
}