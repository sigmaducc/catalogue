package com.adnan.striver.linked_list;

// LeetCode 142: MEDIUM
// https://leetcode.com/problems/linked-list-cycle-ii/

// NOTE: CHECK FLOYD'S CYCLE DETECTION ALGORITHM
// Approach: We simply follow Floyd's cycle detection algorithm.

public class LinkedListCycle2 {

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(1)
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean met = false;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                met = true;
                break;
            }
        }

        if(!met) return null;

        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public int loopLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean met = false;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                met = true;
                break;
            }
        }

        if(!met) return 0;

        slow = slow.next;
        int counter = 1;
        while(slow != fast) {
            counter++;
            slow = slow.next;
        }

        return counter;
    }
}