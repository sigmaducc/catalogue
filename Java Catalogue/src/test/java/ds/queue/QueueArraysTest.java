package ds.queue;

import com.adnan.ds.queue.QueueArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueArraysTest {

    @Test
    void testGrow() {
        QueueArrays<Integer> queue = new QueueArrays<>(2);

        queue.enqueue(1);
        queue.enqueue(2);
        assertEquals(2, queue.getCapacity());

        // Trigger grow
        queue.enqueue(3);

        assertTrue(queue.getCapacity() > 2, "Queue should have grown");
        assertEquals(3, queue.size());
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }

    @Test
    void testShrink() {
        QueueArrays<Integer> queue = new QueueArrays<>(32);

        for (int i = 0; i < 32; i++) queue.enqueue(i);
        assertEquals(32, queue.getCapacity());

        // dequeue most elements to trigger shrink
        for (int i = 0; i < 28; i++) queue.dequeue();

        assertEquals(4, queue.size());
        assertTrue(queue.getCapacity() < 32, "Queue should have shrunk");
    }

    @Test
    void testShrinkToDefaultCapacity() {
        QueueArrays<Integer> queue = new QueueArrays<>(32);

        for (int i = 0; i < 32; i++) queue.enqueue(i);

        while (!queue.isEmpty()) queue.dequeue();

        // Should not shrink below DEFAULT_CAPACITY (10)
        assertTrue(queue.getCapacity() >= 10, "Capacity should not go below default");
        assertTrue(queue.getCapacity() <= 16, "Capacity should shrink from 32 to a valid size");
        assertTrue(queue.isEmpty());
    }

    @Test
    void testMultipleGrowAndShrink() {
        QueueArrays<Integer> queue = new QueueArrays<>(4);

        // Grow
        for (int i = 0; i < 100; i++) queue.enqueue(i);
        assertTrue(queue.getCapacity() >= 100);

        // Shrink
        for (int i = 0; i < 95; i++) queue.dequeue();
        assertEquals(5, queue.size());
        assertTrue(queue.getCapacity() < 100);
    }

    @Test
    void testOrderAfterResize() {
        QueueArrays<Integer> queue = new QueueArrays<>(2);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3); // grow

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

}