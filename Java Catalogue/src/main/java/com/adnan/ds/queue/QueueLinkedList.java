package com.adnan.ds.queue;

import com.adnan.ds.linked_list.singly.Node;

import java.util.NoSuchElementException;

public class QueueLinkedList<T> implements Queue<T> {

    int currentSize = 0;
    Node<T> start = null;
    Node<T> end = null;

    @Override
    public void enqueue(T x) {
        Node<T> node = new Node<>(x);

        if(this.isEmpty()) {
            this.start = node;
            this.end = node;
        } else {
            this.end.setNext(node);
            this.end = node;
        }

        this.currentSize++;
    }

    @Override
    public T dequeue() {
        if(this.isEmpty())
            throw new NoSuchElementException();

        T val = this.start.getData();
        this.start = this.start.getNext();
        this.currentSize--;

        if(this.isEmpty())
            this.end = null;

        return val;
    }

    @Override
    public T peek() {
        if(this.isEmpty())
            throw new NoSuchElementException();

        return this.start.getData();
    }

    @Override
    public int size() {
        return this.currentSize;
    }

    @Override
    public boolean isEmpty() {
        return this.currentSize == 0;
    }

}