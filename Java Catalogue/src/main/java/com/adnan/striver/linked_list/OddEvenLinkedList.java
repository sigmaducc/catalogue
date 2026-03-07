package com.adnan.striver.linked_list;

// LeetCode 328: MEDIUM
// https://leetcode.com/problems/odd-even-linked-list/

// Approach: Since, we know the list always starts at odd and next is even and
// so on and so forth. We simply, Move 2 steps at a time and modify the linking.
// We store first and second element also early conditions check for 0,1 or 2 elements.
// We learn from the slow and fast pointer approach. We check until even is last or
// second last element. We simply keep moving 2 steps for odd and even and keep modifying
// the links. In the end, we link the first even element of list to the last odd element.

public class OddEvenLinkedList {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return head;

        ListNode odd = head;
        ListNode headNext = head.next;
        ListNode even = head.next;

        while(even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = headNext;

        return head;
    }
}