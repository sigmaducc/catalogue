package com.adnan.ds.linked_list.doubly;

import java.util.StringJoiner;

public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;

    public Node() {
        this.data = null;
        this.next = null;
        this.prev = null;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(T data, Node<T> next, Node<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node<T> getNext() { return this.next; }
    public void setNext(Node<T> next) { this.next = next; }

    public Node<T> getPrev() { return this.prev; }
    public void setPrev(Node<T> prev) { this.prev = prev; }

    public T getData() { return this.data; }
    public void setData(T data) { this.data = data; }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(" <-> ");

        Node<T> curr = this;

        sj.add("null");
        while (curr != null) {
            sj.add(String.valueOf(curr.data));
            curr = curr.next;
        }
        sj.add("null");

        return sj.toString();
    }

    public String debugString() {
        StringJoiner sj = new StringJoiner(" ");

        Node<T> curr = this;

        while (curr != null) {
            String prev = curr.prev != null ? String.valueOf(curr.prev.data) : "null";
            String next = curr.next != null ? String.valueOf(curr.next.data) : "null";

            sj.add("[" + prev + " <- " + curr.data + " -> " + next + "]");

            curr = curr.next;
        }

        return sj.toString();
    }
}