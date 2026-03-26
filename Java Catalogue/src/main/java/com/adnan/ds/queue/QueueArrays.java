package com.adnan.ds.queue;

import java.util.NoSuchElementException;

public class QueueArrays<T> implements Queue<T> {

    private final int DEFAULT_CAPACITY = 10;
    private int capacity = DEFAULT_CAPACITY;
    private Object[] queue;
    private int currentSize = 0;
    private int start = -1;
    private int end = -1;

    public QueueArrays() {
        this.queue = new Object[this.capacity];
    }

    public QueueArrays(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
    }

    @Override
    public void enqueue(T x) {
        if(this.currentSize == this.capacity)
            this.resize();

        if (this.isEmpty()) {
            this.start = 0;
            this.end = 0;
        } else {
            this.end = (this.end + 1) % this.capacity;
        }

        this.queue[this.end] = x;
        this.currentSize++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() {
        if(this.isEmpty())
            throw new NoSuchElementException();

        T val = (T) this.queue[this.start];

        this.queue[this.start] = null;
        this.start = (this.start + 1) % this.capacity;
        this.currentSize--;

        if(this.currentSize == 0) {
            this.start = -1;
            this.end = -1;
        }

        if(this.currentSize <= this.capacity / 4)
            this.shrink();

        return val;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if(this.isEmpty())
            throw new NoSuchElementException();

        return (T) this.queue[this.start];
    }

    @Override
    public int size() {
        return this.currentSize;
    }

    @Override
    public boolean isEmpty() {
        return this.currentSize == 0;
    }

    public int getCapacity() {
        return this.capacity;
    }

    private void resize() {
        int capacity = this.capacity * 2;
        Object[] q = new Object[capacity];

        for(int i = 0; i <= this.currentSize - 1; i++) {
            q[i] = this.queue[(this.start + i) % this.capacity];
        }

        this.start = 0;
        this.end = this.currentSize - 1;
        this.queue = q;
        this.capacity = capacity;
    }

    private void shrink() {
        int capacity = this.capacity / 2;

        if(capacity < this.DEFAULT_CAPACITY) return;

        System.out.println("shrinking capacity from " + this.capacity + " to " + capacity);

        Object[] q = new Object[capacity];
        for(int i = 0; i <= this.currentSize - 1; i++) {
            q[i] = this.queue[(start + i) % this.capacity];
        }

        this.start = 0;
        this.end = currentSize - 1;
        this.capacity = capacity;
        this.queue = q;
    }

}