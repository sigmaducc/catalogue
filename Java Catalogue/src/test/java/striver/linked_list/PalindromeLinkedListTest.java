package striver.linked_list;

import com.adnan.striver.linked_list.LinkedListUtils;
import com.adnan.striver.linked_list.ListNode;
import com.adnan.striver.linked_list.PalindromeLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeLinkedListTest {

    private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    void test1() {
        int[] nums = {1,2,2,1};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        boolean result = palindromeLinkedList.isPalindrome(head);

        assertTrue(result);
    }

    @Test
    void test2() {
        int[] nums = {1,2};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        boolean result = palindromeLinkedList.isPalindrome(head);

        assertFalse(result);
    }

    @Test
    void test3() {
        int[] nums = {1};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        boolean result = palindromeLinkedList.isPalindrome(head);

        assertTrue(result);
    }

    @Test
    void test4() {
        int[] nums = {1, 0, 1};

        ListNode head = LinkedListUtils.construct(nums);
        LinkedListUtils.print(head);
        boolean result = palindromeLinkedList.isPalindrome(head);

        assertTrue(result);
    }

}