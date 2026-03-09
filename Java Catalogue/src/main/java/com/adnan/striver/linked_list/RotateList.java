package com.adnan.striver.linked_list;

// LeetCode 61: MEDIUM
// https://leetcode.com/problems/rotate-list/

// Approach: Find the l - k position in list and the tail of list.
// Simply, attach tail to head, make l-k as head and make l-k.next as null.

public class RotateList {

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(1)
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;

        int len = length(head);
        k = k % len;
        int n = len - k;

        int c = 0;
        ListNode tail = head;
        ListNode kth = null;
        while(tail.next != null) {
            if(++c == n) kth = tail;
            tail = tail.next;
        }

        if(kth == null) return head;

        tail.next = head;
        head = kth.next;
        kth.next = null;

        return head;
    }

    private int length(ListNode head) {
        int c = 0;
        while(head != null) {
            c++;
            head = head.next;
        }

        return c;
    }
}