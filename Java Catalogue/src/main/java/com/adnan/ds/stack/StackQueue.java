package com.adnan.ds.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackQueue<T> implements Stack<T> {
    Deque<T> queue = new ArrayDeque<>();

    @Override
    public void push(T x) {
        queue.push(x);

        for(int i = 0; i < queue.size() - 1; i++) {
            queue.push(queue.removeFirst());
        }
    }

    @Override
    public T top() {
        return this.queue.getFirst();
    }

    @Override
    public T pop() {
        return this.queue.removeFirst();
    }

    @Override
    public int size() {
        return this.queue.size();
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
}