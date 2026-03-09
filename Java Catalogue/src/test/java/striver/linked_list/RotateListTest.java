package striver.linked_list;

import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import com.adnan.striver.linked_list.RotateList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateListTest {

    private final RotateList rotateList = new RotateList();

    @Test
    void test1() {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        int[] output = {4,5,1,2,3};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = rotateList.rotateRight(head, k);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test2() {
        int[] nums = {0,1,2};
        int k = 4;
        int[] output = {2,0,1};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = rotateList.rotateRight(head, k);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

}