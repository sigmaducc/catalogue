package ds.stack;

import com.adnan.ds.stack.Stack;

public interface StackFactory {

    <T> Stack<T> create();

}