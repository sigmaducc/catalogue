package com.adnan.striver.linked_list;

// LeetCode 876: EASY
// https://leetcode.com/problems/middle-of-the-linked-list/

// Approach: Use slow and fast pointer. Basically, slow pointer moves 1 step
// and fast pointer moves 2 steps. When fast pointer reached last element
// that means slow pointer would have reached only halfway. Hence, this algorithm.

public class MiddleOfTheLinkedList {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode middleNode(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        while(hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;
        }

        return tortoise;
    }

    // We check next and next.next so if condition is required so that we don't
    // call next on next which is null.
//    public ListNode middleNode(ListNode head) {
//        ListNode tortoise = head;
//        ListNode hare = head;
//
//        while(hare.next != null) {
//            if(hare.next.next != null) {
//                hare = hare.next.next;
//            } else {
//                hare = hare.next;
//            }
//
//            tortoise = tortoise.next;
//        }
//
//        return tortoise;
//    }
}