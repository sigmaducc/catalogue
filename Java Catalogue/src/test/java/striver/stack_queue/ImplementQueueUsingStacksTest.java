package striver.stack_queue;

import com.adnan.striver.stack_queue.ImplementQueueUsingStacks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ImplementQueueUsingStacksTest {

    private ImplementQueueUsingStacks queue;

    @Test
    void test1() {
        String[] operations = {"MyQueue", "push", "push", "peek", "pop", "empty"};
        int[][] args = { {}, {1}, {2}, {}, {}, {} };
        Object[] expected = { null, null, null, 1, 1, false };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MyQueue":
                    this.queue = new ImplementQueueUsingStacks();
                    assertNull(null);
                    break;
                case "push":
                    this.queue.push(args[i][0]);
                    assertNull(expected[i]);
                    break;
                case "pop":
                    assertEquals(expected[i], this.queue.pop());
                    break;
                case "top":
                    assertEquals(expected[i], this.queue.peek());
                    break;
                case "empty":
                    assertEquals(expected[i], this.queue.empty());
                    break;
            }
        }
    }
}