package com.adnan.ds.queue;

public interface Queue<T> {

    void enqueue(T x);

    T dequeue();

    T peek();

    int size();

    boolean isEmpty();

}