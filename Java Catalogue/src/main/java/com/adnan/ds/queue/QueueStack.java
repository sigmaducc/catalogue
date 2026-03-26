package com.adnan.ds.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class QueueStack<T> implements Queue<T> {

    Deque<T> stack1 = new ArrayDeque<>();
    Deque<T> stack2 = new ArrayDeque<>();

    @Override
    public void enqueue(T x) {
        while(!this.stack1.isEmpty()) {
            this.stack2.push(this.stack1.pop());
        }

        stack1.push(x);

        while(!this.stack2.isEmpty()) {
            this.stack1.push(this.stack2.pop());
        }
    }

    @Override
    public T dequeue() {
        if(this.stack1.isEmpty())
            throw new NoSuchElementException();

        return this.stack1.pop();
    }

    @Override
    public T peek() {
        if(this.stack1.isEmpty())
            throw new NoSuchElementException();

        return this.stack1.peek();
    }

    @Override
    public int size() {
        return this.stack1.size();
    }

    @Override
    public boolean isEmpty() {
        return this.stack1.isEmpty();
    }

}