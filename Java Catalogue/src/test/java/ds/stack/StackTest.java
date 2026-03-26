package ds.stack;

import com.adnan.ds.stack.Stack;
import com.adnan.ds.stack.StackArrays;
import com.adnan.ds.stack.StackLinkedList;
import com.adnan.ds.stack.StackQueue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    static Stream<StackFactory> provideStacks() {
        return Stream.of(
                new StackFactory() {
                    @Override
                    public <T> Stack<T> create() {
                        return new StackArrays<>();
                    }
                },
                new StackFactory() {
                    @Override
                    public <T> Stack<T> create() {
                        return new StackLinkedList<>();
                    }
                },
                new StackFactory() {
                    @Override
                    public <T> Stack<T> create() {
                        return new StackQueue<>();
                    }
                }
        );
    }

    @ParameterizedTest
    @MethodSource("provideStacks")
    void testPushAndTop(StackFactory factory) {
        Stack<Integer> stack = factory.create();

        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.top());
        assertEquals(2, stack.size());
    }

    @ParameterizedTest
    @MethodSource("provideStacks")
    void testPop(StackFactory factory) {
        Stack<Integer> stack = factory.create();

        stack.push(10);
        stack.push(20);

        int val = stack.pop();

        assertEquals(20, val);
        assertEquals(1, stack.size());
        assertEquals(10, stack.top());
    }

    @ParameterizedTest
    @MethodSource("provideStacks")
    void testUnderflowPop(StackFactory factory) {
        Stack<Integer> stack = factory.create();

        assertThrows(RuntimeException.class, stack::pop);
    }

    @ParameterizedTest
    @MethodSource("provideStacks")
    void testUnderflowTop(StackFactory factory) {
        Stack<Integer> stack = factory.create();

        assertThrows(NoSuchElementException.class, stack::top);
    }

    @ParameterizedTest
    @MethodSource("provideStacks")
    void testMultiplePushPop(StackFactory factory) {
        Stack<Integer> stack = factory.create();

        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        assertEquals(100, stack.size());

        for (int i = 99; i >= 0; i--) {
            assertEquals(i, stack.pop());
        }

        assertEquals(0, stack.size());
    }

    @ParameterizedTest
    @MethodSource("provideStacks")
    void testInterleavedOperations(StackFactory factory) {
        Stack<Integer> stack = factory.create();

        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());

        stack.push(3);
        assertEquals(3, stack.top());

        stack.push(4);
        assertEquals(4, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(1, stack.pop());
    }

}