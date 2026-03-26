package striver.stack_queue;

import com.adnan.striver.stack_queue.ImplementStackUsingQueues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ImplementStackUsingQueuesTest {

    private ImplementStackUsingQueues stack;

    @Test
    void test1() {
        String[] operations = {"MyStack", "push", "push", "top", "pop", "empty"};
        int[][] args = { {}, {1}, {2}, {}, {}, {} };
        Object[] expected = { null, null, null, 2, 2, false };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MyStack":
                    stack = new ImplementStackUsingQueues();
                    assertNull(null);
                    break;
                case "push":
                    stack.push(args[i][0]);
                    assertNull(expected[i]);
                    break;
                case "pop":
                    assertEquals(expected[i], stack.pop());
                    break;
                case "top":
                    assertEquals(expected[i], stack.top());
                    break;
                case "empty":
                    assertEquals(expected[i], stack.empty());
                    break;
            }
        }
    }

}