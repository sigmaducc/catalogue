package ds.stack;

import com.adnan.ds.stack.Stack;
import com.adnan.ds.stack.StackArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackArraysTest {

    @Test
    void testShrink() {
        Stack<Integer> stack = new StackArrays<>(16);

        // Fill stack
        for (int i = 0; i < 16; i++) {
            stack.push(i);
        }

        // Remove most elements → should trigger shrink
        for (int i = 0; i < 13; i++) {
            stack.pop();
        }

        assertTrue(stack.size() <= 3);
    }

    @Test
    void testShrinkBehaviorIndirectly() {
        Stack<Integer> stack = new StackArrays<>(10);

        // Step 1: Push enough to trigger growth (10 → 20)
        for (int i = 0; i < 50; i++) {
            stack.push(i);
        }

        // Step 2: Pop most elements to trigger shrink multiple times
        for (int i = 0; i < 45; i++) {
            assertEquals(49 - i, stack.pop());
        }

        // Now stack has 5 elements

        // Step 3: Ensure stack still behaves correctly after shrink
        for (int i = 0; i < 5; i++) {
            assertEquals(4 - i, stack.pop());
        }

        // Step 4: Stack should now be empty
        assertEquals(0, stack.size());
        assertThrows(RuntimeException.class, stack::pop);
    }

    @Test
    void testResizeGrow() {
        Stack<Integer> stack = new StackArrays<>(2);

        stack.push(1);
        stack.push(2);

        // should trigger resize
        stack.push(3);

        assertEquals(3, stack.size());
        assertEquals(3, stack.top());
    }

}