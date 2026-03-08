package com.adnan.striver.linked_list;

// LeetCode 160: EASY
// https://leetcode.com/problems/intersection-of-two-linked-lists/

// Approach: Use two pointer technique. Get length of both lists, and subtract
// them. That would give you the number of steps you need to skip in larger
// list to match with the other list.

// NOTE: TESTCASES not written because it is difficult to write testcases.

public class IntersectionOfTwoLinkedLists {

    // Time Complexity: O(m + n + max(m, n)) ~ O(1)
    // Space Complexity: O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;

        int l1 = length(headA);
        int l2 = length(headB);

        ListNode fast = headA;
        ListNode slow = headB;
        int n = l1 - l2;

        if(l2 > l1) {
            fast = headB;
            slow = headA;
            n = l2 - l1;
        }

        while(n-- > 0) fast = fast.next;

        while(slow != null && fast != null) {
            if(slow == fast)
                return slow;

            slow = slow.next;
            fast = fast.next;
        }

        return null;
    }

    private int length(ListNode head) {
        int counter = 0;

        while(head != null) {
            counter++;
            head = head.next;
        }

        return counter;
    }
}