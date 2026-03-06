package com.adnan.ds.linked_list.doubly;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList {

    public void print(Node<Integer> head) {
        System.out.println(head);
    }

    public int[] toArray(Node<Integer> head) {
        List<Integer> list = new ArrayList<>();

        Node<Integer> curr = head;

        while(curr != null) {
            list.add(curr.getData());
            curr = curr.getNext();
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public Node<Integer> construct(int[] nums) {
        Node<Integer> head = new Node<>(nums[0]);
        Node<Integer> prev = head;
        for(int i = 1; i <= nums.length - 1; i++) {
            Node<Integer> curr = new Node<>(nums[i], null, prev);
            prev.setNext(curr);
            prev = curr;
        }

        return head;
    }

    public Node<Integer> deleteHead(Node<Integer> head) {
        if(head == null || head.getNext() == null) return null;

        head = head.getNext();
        head.setPrev(null);

        return head;
    }

    public Node<Integer> deleteTail(Node<Integer> head) {
        if(head == null || head.getNext() == null) return null;

        Node<Integer> tail = head;
        while(tail.getNext() != null) {
            tail = tail.getNext();
        }
        Node<Integer> prev = tail.getPrev();
        prev.setNext(null);

        return head;
    }

    public Node<Integer> deleteAt(Node<Integer> head, int pos) {
        if(head == null || pos == 0) return null;

        int counter = 0;
        Node<Integer> curr = head;
        while(curr != null && counter <= pos - 1) {
            counter++;
            if(counter == pos) break;

            curr = curr.getNext();
        }

        if(curr == null) return head;

        Node<Integer> prev = curr.getPrev();
        Node<Integer> next = curr.getNext();

        if(prev == null && next == null)
            return null;
        else if(prev == null) {
            next.setPrev(null);
            head = next;
        } else if(next == null) {
            prev.setNext(null);
        } else {
            prev.setNext(next);
            next.setPrev(prev);
        }

        return head;
    }

}