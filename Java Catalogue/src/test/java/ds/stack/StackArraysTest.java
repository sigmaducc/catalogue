package ds.stack;

import com.adnan.ds.stack.StackArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackArraysTest {

    @Test
    void testGrow() {
        StackArrays<Integer> stack = new StackArrays<>(2);
        assertEquals(2, stack.getCapacity());

        stack.push(1);
        stack.push(2);

        // Trigger growth
        stack.push(3);

        assertEquals(3, stack.size());
        assertTrue(stack.getCapacity() > 2, "Stack should have grown");
        assertEquals(3, stack.top());
    }

    @Test
    void testShrink() {
        StackArrays<Integer> stack = new StackArrays<>(32);

        for (int i = 0; i < 32; i++) stack.push(i);
        assertEquals(32, stack.getCapacity());

        // Pop enough to trigger shrink above DEFAULT_CAPACITY
        for (int i = 0; i < 28; i++) stack.pop(); // leaves 4 elements

        assertEquals(4, stack.size());
        assertTrue(stack.getCapacity() < 32, "Stack should have shrunk");
    }

    @Test
    void testShrinkToDefaultCapacity() {
        StackArrays<Integer> stack = new StackArrays<>(20);

        for (int i = 0; i < 20; i++) stack.push(i);

        // Pop almost everything
        while (!stack.isEmpty()) stack.pop();

        // Should not shrink below DEFAULT_CAPACITY (10)
        assertEquals(10, stack.getCapacity());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testMultipleGrowAndShrink() {
        StackArrays<Integer> stack = new StackArrays<>(4);

        // Grow multiple times
        for (int i = 0; i < 100; i++) stack.push(i);
        assertTrue(stack.getCapacity() >= 100);

        // Shrink multiple times
        for (int i = 0; i < 95; i++) stack.pop();
        assertEquals(5, stack.size());
        assertTrue(stack.getCapacity() < 100);
    }

    @Test
    void testOrderAfterResize() {
        StackArrays<Integer> stack = new StackArrays<>(2);

        stack.push(1);
        stack.push(2);
        stack.push(3); // grow

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

}