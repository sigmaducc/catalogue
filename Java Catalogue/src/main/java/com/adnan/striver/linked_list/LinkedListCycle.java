package com.adnan.striver.linked_list;

// LeetCode 141: EASY
// https://leetcode.com/problems/linked-list-cycle/

// Approach: Use slow and fast pointer. If there is cycle they will catch
// up if not return false because fast pointer will reach tail first.

public class LinkedListCycle {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast)
                return true;
        }

        return false;
    }
}