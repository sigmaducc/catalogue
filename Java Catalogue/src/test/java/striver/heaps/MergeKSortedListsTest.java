package striver.heaps;

import com.adnan.striver.heaps.MergeKSortedLists;
import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeKSortedListsTest {

    private final MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();

    @Test
    void test1() {
        int[][] nums = {{1,4,5},{1,3,4},{2,6}};
        int[] output = {1,1,2,3,4,4,5,6};

        ListNode[] lists = new ListNode[nums.length];
        for(int i = 0; i <= nums.length - 1; i++) {
            ListNode head = LinkedListUtils.construct(nums[i]);
            lists[i] = head;
        }

        ListNode head = mergeKSortedLists.mergeKLists(lists);
        int[] result = LinkedListUtils.toArray(head);

        assertArrayEquals(output, result);
    }

    @Test
    void test2() {
        int[][] nums = {{}};
        int[] output = {};

        ListNode[] lists = new ListNode[nums.length];
        for(int i = 0; i <= nums.length - 1; i++) {
            ListNode head = LinkedListUtils.construct(nums[i]);
            lists[i] = head;
        }

        ListNode head = mergeKSortedLists.mergeKLists(lists);
        int[] result = LinkedListUtils.toArray(head);

        assertArrayEquals(output, result);
    }

    @Test
    void test3() {
        int[] output = {};

        ListNode head = mergeKSortedLists.mergeKLists(new ListNode[] {});
        int[] result = LinkedListUtils.toArray(head);

        assertArrayEquals(output, result);
    }

}