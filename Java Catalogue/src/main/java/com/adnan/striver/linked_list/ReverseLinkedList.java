package com.adnan.striver.linked_list;

// LeetCode 206: EASY
// https://leetcode.com/problems/reverse-linked-list/

// Approach: We start from second element. Before we actually start we
// mark the next of first element as null. But we need to store it first
// before marking null, or we won't be able to move forward. Now, we have
// our current element, with it let's store our next element as well. Now simply,
// make the next of current element as prev/head. And simply move head and current.

public class ReverseLinkedList {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

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
}