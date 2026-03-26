package com.adnan.ds.stack;

import java.util.NoSuchElementException;

public class StackArrays<T> implements Stack<T> {

    private final int DEFAULT_CAPACITY = 10;
    private int capacity = DEFAULT_CAPACITY;
    private Object[] stack;
    private int top = -1;

    public StackArrays() {
        this.stack = new Object[this.capacity];
    }

    public StackArrays (int capacity) {
        this.capacity = capacity;
        this.stack = new Object[capacity];
    }

    @Override
    public void push(T x) {
        if(this.size() == this.capacity)
            resize();

        this.stack[++this.top] = x;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if(this.isEmpty())
            throw new NoSuchElementException();

        T val = (T) this.stack[this.top];
        this.stack[this.top--] = null;

        if(this.size() <= this.capacity / 4) {
            this.shrink();
        }

        return val;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T top() {
        if(this.isEmpty())
            throw new NoSuchElementException();

        return (T) this.stack[this.top];
    }

    @Override
    public int size() {
        return this.top + 1;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int getCapacity() {
        return this.capacity;
    }

    private void resize() {
        int capacity = this.capacity * 2;

        Object[] st = new Object[capacity];

        System.arraycopy(this.stack, 0, st, 0, this.top + 1);

        this.stack = st;
        this.capacity = capacity;
    }

    private void shrink() {
        int capacity = this.capacity / 2;

        if(capacity < this.DEFAULT_CAPACITY) return;

        Object[] st = new Object[capacity];

        System.arraycopy(this.stack, 0, st, 0, this.top + 1);

        this.stack = st;
        this.capacity = capacity;
    }
}