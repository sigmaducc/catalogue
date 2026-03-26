package com.adnan.ds.stack;

public interface Stack<T> {

    void push(T x);

    T top();

    T pop();

    int size();

    boolean isEmpty();

}