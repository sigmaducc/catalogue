package com.adnan.striver.heaps;

import com.adnan.striver.linked_list.ListNode;

import java.util.PriorityQueue;

// LeetCode 23: HARD
// https://leetcode.com/problems/merge-k-sorted-lists/

// Approach 1: Using min-heap we can simply solve this problem by placing each head into the heap.
// Then we keep picking up from the heap (will always be the minimum) after picking node out we
// need to place the next node into the heap. While doing it we need to build the linked list so
// we keep a track using curr.

// Approach 2: We use merge sort and divide the list of size K into log K recursion calls. Then in
// each mergeList call we do a linear iteration going through all elements of 2 lists.

// M = N * K
// 0 <= N <= 500
// 0 <= K <= 1e4
// 0 <= M <= 5e6

public class MergeKSortedLists {

    // Time Complexity: O(K * log K + (M - K) * 2 * log K) ~ O(K log K + M log K) ~ O(M log K)
    // Reason: For adding K heads each taking log K operations. Then we keep adding (M - K) elements
    // each taking 2 log K operations.
    // Space Complexity: O(K) or O(K + M)
    // Reason: We always store K elements only in heap. If we consider the linked list space then
    // another M space for it.
    public ListNode mergeKLists(ListNode[] lists) {
         PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);

         for(ListNode node: lists) {
             if(node != null) {
                 heap.add(node);
             }
         }

         ListNode head = new ListNode();
         ListNode curr = head;
         while(!heap.isEmpty()) {
             ListNode node = heap.poll();

             if(node.next != null)
                 heap.add(node.next);

             curr.next = node;
             curr = node;
         }

         return head.next;
    }

    // Time Complexity: O(M log K)
    // Reason: List of size K divides into log K and there are M elements.
    // Space Complexity: O(1) or O(log K)
    // Reason: Recursion stack
//    public ListNode mergeKLists(ListNode[] lists) {
//        if(lists.length == 0) return null;
//
//        return merge(lists, 0, lists.length - 1);
//    }

    private ListNode merge(ListNode[] lists, int low, int high) {
        if(low >= high) return lists[low];

        int mid = low + (high - low) / 2;

        ListNode head1 = merge(lists, low, mid);
        ListNode head2 = merge(lists, mid+1, high);

        return mergeLists(head1, head2);
    }

    private ListNode mergeLists(ListNode head1, ListNode head2) {
        ListNode head = new ListNode();
        ListNode curr = head;

        while(head1 != null && head2 != null) {
            if(head1.val <= head2.val) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }

            curr = curr.next;
        }

        if(head1 != null) curr.next = head1;
        if(head2 != null) curr.next = head2;

        return head.next;
    }
}