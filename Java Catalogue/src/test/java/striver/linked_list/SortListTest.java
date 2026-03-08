package striver.linked_list;

import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import com.adnan.striver.linked_list.SortList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortListTest {

    private final SortList sortList = new SortList();

    @Test
    void test1() {
        int[] nums = {4,2,1,3};
        int[] output = {1,2,3,4};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = sortList.sortList(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test2() {
        int[] nums = {-1,5,3,4,0};
        int[] output = {-1,0,3,4,5};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = sortList.sortList(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

    @Test
    void test3() {
        int[] nums = {};
        int[] output = {};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        head = sortList.sortList(head);
        LinkedListUtils.print(head);

        assertArrayEquals(output, LinkedListUtils.toArray(head));
    }

}