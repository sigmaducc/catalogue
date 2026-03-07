package com.adnan.striver.linked_list;

// LeetCode 19: MEDIUM
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

// Approach 1: We use counters to solve our problem which is good enough.
// In the first pass we find the length of the list. In the second pass
// we get the element that needs deletion using l - n + 1 for 1 based indexing.

// Approach 2: We have 2 pointers, slow and fast. Fast is always n steps ahead
// of slow. So in first pass we move fast for n steps. Then we start iterating
// over the list until we reach last element on fast. At this point slow would
// be at l-n element, and we can simply change the pointers and return.

public class RemoveNthNodeFromEndOfList {

    // Time Complexity: O(length)
    // Space Complexity: O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        while(n-- > 0) fast = fast.next;

        if(fast == null)
            return head.next;

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    // Time Complexity: O(length + length-n) ~ O(length)
    // Space Complexity: O(1)
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head == null || head.next == null) return null;
//
//        int l = length(head);
//        int k = l - n + 1;
//
//        if(k == 1) {
//            return head.next;
//        }
//
//        int counter = 1;
//        ListNode prev = head;
//        ListNode curr = head.next;
//
//        while(curr != null) {
//            counter++;
//
//            if(counter == k) {
//                prev.next = curr.next;
//                break;
//            }
//
//            prev = curr;
//            curr = curr.next;
//        }
//
//        return head;
//    }
//
//    private int length(ListNode head) {
//        int counter = 0;
//
//        while(head != null) {
//            counter++;
//            head = head.next;
//        }
//
//        return counter;
//    }
}