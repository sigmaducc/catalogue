package striver.stack_queue;

import com.adnan.striver.stack_queue.MinStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MinStackTest {

    private MinStack stack;

    @Test
    void test1() {
        String[] operations = {"MinStack","push","push","push","getMin","pop","top","getMin"};
        int[][] args = { {}, {-2}, {0}, {-3}, {}, {}, {}, {} };
        Object[] expected = { null, null, null, null, -3, null, 0, -2 };

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MinStack":
                    this.stack = new MinStack();
                    assertNull(expected[i]);
                    break;
                case "push":
                    this.stack.push(args[i][0]);
                    assertNull(expected[i]);
                    break;
                case "pop":
                    this.stack.pop();
                    assertNull(expected[i]);
                    break;
                case "top":
                    assertEquals(expected[i], this.stack.top());
                    break;
                case "getMin":
                    assertEquals(expected[i], this.stack.getMin());
                    break;
            }
        }
    }

    @Test
    void test2() {
        String[] operations = {"MinStack","push","push","getMin","getMin","push","getMin","getMin","top","getMin","pop","push","push","getMin","push","pop","top","getMin","pop"};
        int[][] args = {{},{-10},{14},{},{},{-20},{},{},{},{},{},{10},{-7},{},{-7},{},{},{},{}};
        Object[] expected = {null,null,null,-10,-10,null,-20,-20,-20,-20,null,null,null,-10,null,null,-7,-10,null};

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "MinStack":
                    this.stack = new MinStack();
                    assertNull(expected[i]);
                    break;
                case "push":
                    this.stack.push(args[i][0]);
                    assertNull(expected[i]);
                    break;
                case "pop":
                    this.stack.pop();
                    assertNull(expected[i]);
                    break;
                case "top":
                    assertEquals(expected[i], this.stack.top());
                    break;
                case "getMin":
                    assertEquals(expected[i], this.stack.getMin());
                    break;
            }
        }
    }

}