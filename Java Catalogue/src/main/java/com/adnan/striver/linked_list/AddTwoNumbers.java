package com.adnan.striver.linked_list;

// LeetCode 2: MEDIUM
// https://leetcode.com/problems/add-two-numbers/

// Approach: We measure the lengths of both the lists first. After that
// whichever is bigger we make it our iterative list. We iterate over both
// lists simulataniously and add the numbers and keep track of digits place
// and carry. We add the digit to curr node. And move forward on both l1 and
// l2. We also move forward on curr, but we place a null check here.
// Finally, after this step we will have smaller list fulfilled. We need to
// check if l1 or l2 is incomplete and go complete it. Finally, if we have
// a pending carry we add it in the list.

public class AddTwoNumbers {

    // Time Complexity: O(m + n + max(m, n)) ~ O(m + n)
    // Space Complexity: O(1)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode node = l1;

        int len1 = length(l1);
        int len2 = length(l2);

        if(len2 > len1) node = l2;

        int carry = 0;
        ListNode curr = node;
        while(l1 != null && l2 != null) {
            int val = l1.val + l2.val + carry;
            carry = val / 10;
            curr.val = val % 10;
            l1 = l1.next;
            l2 = l2.next;

            if(curr.next != null)
                curr = curr.next;
        }

        while(l1 != null) {
            int val = l1.val + carry;
            carry = val / 10;
            l1.val = val % 10;
            curr = l1;
            l1 = l1.next;
        }

        while(l2 != null) {
            int val = l2.val + carry;
            carry = val / 10;
            l2.val = val % 10;
            curr = l2;
            l2 = l2.next;
        }

        if(carry == 1)
            curr.next = new ListNode(carry);

        return node;
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