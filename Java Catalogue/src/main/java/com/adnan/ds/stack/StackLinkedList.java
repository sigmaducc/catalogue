package com.adnan.ds.stack;

import com.adnan.ds.linked_list.singly.Node;

import java.util.NoSuchElementException;

public class StackLinkedList<T> implements Stack<T> {

    Node<T> top = null;
    int size = 0;

    @Override
    public void push(T x) {
        this.top = new Node<>(x, this.top);
        this.size++;
    }

    @Override
    public T top() {
        if(this.top == null)
            throw new NoSuchElementException();

        return this.top.getData();
    }

    @Override
    public T pop() {
        if(this.top == null)
            throw new NoSuchElementException();

        T val = this.top.getData();
        this.top = this.top.getNext();

        this.size--;
        return val;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }
}