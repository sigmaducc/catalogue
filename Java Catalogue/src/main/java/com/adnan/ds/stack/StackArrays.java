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
        checkOverflow();
        stack[++this.top] = x;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        checkUnderflow();

        T val = (T) stack[this.top];
        stack[top--] = null;

        if(this.size() <= this.capacity / 4) {
            shrink();
        }

        return val;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T top() {
        checkUnderflow();

        return (T) stack[this.top];
    }

    @Override
    public int size() {
        return this.top + 1;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    private void checkUnderflow() {
        if(this.top < 0)
            throw new NoSuchElementException();
    }

    private void checkOverflow() {
        if(this.top >= this.capacity - 1)
            resize();
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

        if(capacity < DEFAULT_CAPACITY) return;

        Object[] st = new Object[capacity];

        System.arraycopy(this.stack, 0, st, 0, this.top + 1);

        this.stack = st;
        this.capacity = capacity;
    }
}