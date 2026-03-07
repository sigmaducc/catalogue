package com.adnan.striver.linked_list;

// LeetCode 234: EASY
// https://leetcode.com/problems/palindrome-linked-list/

// Approach 1: We use stack and put all the data values in it. Then we iterate
// over linked list again and if we encounter a value that is not equal we return false.
// Why do we use stack? Because stack reverses the order because of LIFO.

// Approach 2: We use slow and fast pointer to get middle of list. Then we reverse
// the second half of the list. We then start matching elements from head and middle
// concurrently until we reach end. If we encounter an element that is not equal we
// return false else we return true in the end.

public class PalindromeLinkedList {

    // Time Complexity: O(n + n + n) ~ O(n)
    // Space Complexity: O(1)
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);

        ListNode ptr = slow.next;
        while(ptr != null) {
            if(head.val != ptr.val) return false;

            head = head.next;
            ptr = ptr.next;
        }

        reverse(slow.next);

        return true;
    }

    private ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode curr = head.next;
        head.next = null;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = head;
            head = curr;
            curr = next;
        }

        return head;
    }

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(n)
//    public boolean isPalindrome(ListNode head) {
//        if(head == null || head.next == null) return true;
//
//        Deque<Integer> stack = new ArrayDeque<>();
//
//        ListNode curr = head;
//        while(curr != null) {
//            stack.push(curr.val);
//            curr = curr.next;
//        }
//
//        curr = head;
//
//        while(curr != null) {
//            if(curr.val != stack.pop())
//                return false;
//
//            curr = curr.next;
//        }
//
//        return true;
//    }
}