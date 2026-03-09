package com.adnan.striver.linked_list;

// LeetCode 25: HARD
// https://leetcode.com/problems/reverse-nodes-in-k-group/

// Approach: Watch striver video: https://www.youtube.com/watch?v=lIar1skcQYI

public class ReverseNodesInKGroup {

    // Time Complexity: O(n + n + n) ~ O(n)
    // Space Complexity: O(1)
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode kNode = getKthNode(curr, k);

            if(kNode == null)  {
                if(prev != null)
                    prev.next = curr;

                break;
            }

            ListNode next = kNode.next;
            kNode.next = null;
            reverse(curr);
            if(curr == head)
                head = kNode;
            else
                prev.next = kNode;

            prev = curr;
            curr = next;
        }

        return head;
    }

    private ListNode getKthNode(ListNode head, int k) {
        while(head != null) {
            if(--k == 0)
                return head;

            head = head.next;
        }

        return null;
    }

    private void reverse(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        head.next = null;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }

}