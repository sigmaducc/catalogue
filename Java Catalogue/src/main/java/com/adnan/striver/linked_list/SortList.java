package com.adnan.striver.linked_list;

public class SortList {

    // Time Complexity: O((n/2 + n) * log n) ~ O(n * log n)
    // Space Complexity: O(1)
    public ListNode sortList(ListNode head) {
        return sort(head);
    }

    private ListNode sort(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode middle = findMiddle(head);

        ListNode middleNext = middle.next;
        middle.next = null;

        head = sort(head);
        middleNext = sort(middleNext);

        return merge(head, middleNext);
    }

    private ListNode merge(ListNode n1, ListNode n2) {
        ListNode node = new ListNode(Integer.MIN_VALUE);
        ListNode curr = node;
        while(n1 != null && n2 != null) {
            if(n1.val <= n2.val) {
                curr.next = n1;
                curr = n1;
                n1 = n1.next;
            } else {
                curr.next = n2;
                curr = n2;
                n2 = n2.next;
            }
        }

        if(n1 != null) curr.next = n1;
        if(n2 != null) curr.next = n2;

        return node.next;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}