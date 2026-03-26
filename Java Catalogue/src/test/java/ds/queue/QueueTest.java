package ds.queue;

import com.adnan.ds.queue.Queue;
import com.adnan.ds.queue.QueueArrays;
import com.adnan.ds.queue.QueueLinkedList;
import com.adnan.ds.queue.QueueStack;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    static Stream<QueueFactory> provideQueues() {
        return Stream.of(
                new QueueFactory() {
                    @Override
                    public <T> Queue<T> create() {
                        return new QueueArrays<>();
                    }
                },
                new QueueFactory() {
                    @Override
                    public <T> Queue<T> create() {
                        return new QueueLinkedList<>();
                    }
                },
                new QueueFactory() {
                    @Override
                    public <T> Queue<T> create() {
                        return new QueueStack<>();
                    }
                }
        );
    }

    @ParameterizedTest
    @MethodSource("provideQueues")
    void testEnqueueAndPeek(QueueFactory factory) {
        Queue<Integer> queue = factory.create();

        queue.enqueue(10);
        queue.enqueue(20);

        assertEquals(10, queue.peek());
        assertEquals(2, queue.size());
    }

    @ParameterizedTest
    @MethodSource("provideQueues")
    void testDequeue(QueueFactory factory) {
        Queue<Integer> queue = factory.create();

        queue.enqueue(10);
        queue.enqueue(20);

        int val = queue.dequeue();
        assertEquals(10, val);
        assertEquals(1, queue.size());
        assertEquals(20, queue.peek());
    }

    @ParameterizedTest
    @MethodSource("provideQueues")
    void testUnderflowDequeue(QueueFactory factory) {
        Queue<Integer> queue = factory.create();

        assertThrows(NoSuchElementException.class, queue::dequeue);
    }

    @ParameterizedTest
    @MethodSource("provideQueues")
    void testUnderflowPeek(QueueFactory factory) {
        Queue<Integer> queue = factory.create();

        assertThrows(NoSuchElementException.class, queue::peek);
    }

    @ParameterizedTest
    @MethodSource("provideQueues")
    void testMultipleEnqueueDequeue(QueueFactory factory) {
        Queue<Integer> queue = factory.create();

        for (int i = 0; i < 100; i++) {
            queue.enqueue(i);
        }

        assertEquals(100, queue.size());

        for (int i = 0; i < 100; i++) {
            assertEquals(i, queue.dequeue());
        }

        assertEquals(0, queue.size());
    }

    @ParameterizedTest
    @MethodSource("provideQueues")
    void testInterleavedOperations(QueueFactory factory) {
        Queue<Integer> queue = factory.create();

        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(1, queue.dequeue());

        queue.enqueue(3);
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.peek());

        queue.enqueue(4);
        assertEquals(3, queue.dequeue());
        assertEquals(4, queue.dequeue());

        assertTrue(queue.isEmpty());
    }

}