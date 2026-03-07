package com.adnan.striver.linked_list;

// LeetCode 2095: MEDIUM
// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

// Approach: Use slow and fast pointer to find the mid-element. Keep track
// of prev which will be prev of middle. In the end simply point prev to
// mid's next.

public class DeleteTheMiddleNodeOfALinkedList {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;
    }
}