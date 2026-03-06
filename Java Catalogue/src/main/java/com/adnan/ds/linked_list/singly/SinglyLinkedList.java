package com.adnan.ds.linked_list.singly;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList {

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
        if(nums.length == 0) return null;

        Node<Integer> head = new Node<>(nums[0]);
        Node<Integer> prev = head;
        for(int i = 1; i <= nums.length -1; i++) {
            Node<Integer> curr = new Node<>(nums[i]);
            prev.setNext(curr);
            prev = curr;
        }

        return head;
    }

    public void traverse(Node<Integer> head) {
        Node<Integer> curr = head;
        while(curr != null) {
            System.out.print("(" + curr.getData() + ") ");
            curr = curr.getNext();
        }

        System.out.println();
    }

    public boolean hasElement(Node<Integer> head, int element) {
        Node<Integer> curr = head;
        while(curr != null) {
            if(curr.getData() == element)
                return true;
            curr = curr.getNext();
        }

        return false;
    }

    public Node<Integer> deleteHead(Node<Integer> head) {
        if(head == null) return null;

        return head.getNext();
    }

    public Node<Integer> deleteTail(Node<Integer> head) {
        if(head == null || head.getNext() == null) return null;

        Node<Integer> curr = head;

        while(curr.getNext().getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(null);

        return head;
    }

    public Node<Integer> deleteAt(Node<Integer> head, int pos) {
        if(head == null) return null;
        if(pos == 1) {
            return head.getNext();
        }

        int counter = 1;
        Node<Integer> prev = head;
        Node<Integer> curr = head.getNext();
        while(curr != null) {
            counter++;

            if(counter == pos) {
                prev.setNext(curr.getNext());
            }

            prev = curr;
            curr = curr.getNext();
        }

        return head;
    }

    public Node<Integer> deleteElement(Node<Integer> head, int element) {
        if(head == null) return null;
        if(head.getData() == element) {
            return head.getNext();
        }

        Node<Integer> prev = head;
        Node<Integer> curr = head.getNext();
        while(curr != null) {
            if(curr.getData() == element) {
                prev.setNext(curr.getNext());
            }

            prev = curr;
            curr = curr.getNext();
        }

        return head;
    }

    public Node<Integer> insertAtHead(Node<Integer> head, int element) {
        return new Node<>(element, head);
    }

    public Node<Integer> insertAtTail(Node<Integer> head, int element) {
        if(head == null) return new Node<>(element);

        Node<Integer> curr = head;

        while(curr.getNext() != null) {
            curr = curr.getNext();
        }

        curr.setNext(new Node<>(element));

        return head;
    }

    public Node<Integer> insertAt(Node<Integer> head, int el, int pos) {
        if(head == null) return null;
        if(pos == 1) return new Node<>(el, head);

        Node<Integer> curr = head;
        int counter = 0;
        while(curr != null) {
            counter++;

            if(counter == (pos-1)) {
                Node<Integer> newNode = new Node<>(el, curr.getNext());
                curr.setNext(newNode);
                break;
            }

            curr = curr.getNext();
        }

        return head;
    }

    public Node<Integer> insertBeforeValue(Node<Integer> head, int el, int val) {
        if(head == null) return null;
        if(head.getData() == val) return new Node<>(el, head);

        Node<Integer> curr = head;
        while(curr.getNext() != null) {
            if(curr.getNext().getData() == val) {
                Node<Integer> newNode = new Node<>(el, curr.getNext());
                curr.setNext(newNode);
                break;
            }

            curr = curr.getNext();
        }

        return head;
    }

}