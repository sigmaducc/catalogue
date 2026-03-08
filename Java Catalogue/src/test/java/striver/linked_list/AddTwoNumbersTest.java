package striver.linked_list;

import com.adnan.striver.linked_list.AddTwoNumbers;
import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AddTwoNumbersTest {

    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void test1() {
        int[] nums1 = {2,4,3};
        int[] nums2 = {5,6,4};
        int[] output = {7,0,8};

        ListNode l1 = LinkedListUtils.construct(nums1);
        LinkedListUtils.print(l1);
        ListNode l2 = LinkedListUtils.construct(nums2);
        LinkedListUtils.print(l2);

        ListNode l = addTwoNumbers.addTwoNumbers(l1, l2);
        LinkedListUtils.print(l);

        assertArrayEquals(output, LinkedListUtils.toArray(l));
    }

    @Test
    void test2() {
        int[] nums1 = {0};
        int[] nums2 = {0};
        int[] output = {0};

        ListNode l1 = LinkedListUtils.construct(nums1);
        LinkedListUtils.print(l1);
        ListNode l2 = LinkedListUtils.construct(nums2);
        LinkedListUtils.print(l2);

        ListNode l = addTwoNumbers.addTwoNumbers(l1, l2);
        LinkedListUtils.print(l);

        assertArrayEquals(output, LinkedListUtils.toArray(l));
    }

    @Test
    void test3() {
        int[] nums1 = {9,9,9,9,9,9,9};
        int[] nums2 = {9,9,9,9};
        int[] output = {8,9,9,9,0,0,0,1};

        ListNode l1 = LinkedListUtils.construct(nums1);
        LinkedListUtils.print(l1);
        ListNode l2 = LinkedListUtils.construct(nums2);
        LinkedListUtils.print(l2);

        ListNode l = addTwoNumbers.addTwoNumbers(l1, l2);
        LinkedListUtils.print(l);

        assertArrayEquals(output, LinkedListUtils.toArray(l));
    }

    @Test
    void test4() {
        int[] nums1 = {5};
        int[] nums2 = {5};
        int[] output = {0, 1};

        ListNode l1 = LinkedListUtils.construct(nums1);
        LinkedListUtils.print(l1);
        ListNode l2 = LinkedListUtils.construct(nums2);
        LinkedListUtils.print(l2);

        ListNode l = addTwoNumbers.addTwoNumbers(l1, l2);
        LinkedListUtils.print(l);

        assertArrayEquals(output, LinkedListUtils.toArray(l));
    }

}