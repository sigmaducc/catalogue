package com.adnan.interviews.disney.oa;

import com.adnan.striver.linked_list.ListNode;

import java.util.ArrayList;
import java.util.List;

//    Avengers Assemble: Linked List Mission
//
//    Nick Fury needs the Avengers and their allies lined up for a top-secret mission!
//    Each hero or ally is represented as a node in a singly linked list:
//
//    - data -> unique code number of the Avenger
//    - next -> pointer to the next Avenger in the queue
//
//    Fury follows a special assembly strategy:
//
//            1. In every round, all Avengers standing at odd-numbered positions
//            (1-based indexing) in the current queue are selected.
//
//            2. The selected Avengers are appended to the final mission lineup
//       while maintaining their relative order.
//
//            3. The selected Avengers are removed from the current queue.
//
//    4. The same process is repeated on the remaining queue until
//    no Avengers are left.
//
//    Your task is to rearrange the linked list according to Fury's strategy
//    and return the head of the final mission lineup.
//
//
//    Function Description
//    --------------------
//
//    Complete the function:
//
//    ListNode createLinkedList(ListNode head)
//
//    Parameters:
//    head -> head of the singly linked list
//
//    Returns:
//    head of the rearranged linked list
//
//
//    Example 1
//            ---------
//
//    Input:
//            1 -> 2 -> 3 -> 4 -> 5
//
//    Round 1:
//    Selected: 1 -> 3 -> 5
//    Remaining: 2 -> 4
//
//    Round 2:
//    Selected: 2
//    Remaining: 4
//
//    Round 3:
//    Selected: 4
//
//    Final Output:
//            1 -> 3 -> 5 -> 2 -> 4
//
//
//    Example 2
//            ---------
//
//    Input:
//            3 -> 5 -> 3 -> 7 -> 8
//
//    Round 1:
//    Selected: 3 -> 3 -> 8
//    Remaining: 5 -> 7
//
//    Round 2:
//    Selected: 5
//    Remaining: 7
//
//    Round 3:
//    Selected: 7
//
//    Final Output:
//            3 -> 3 -> 8 -> 5 -> 7
//
//
//    Constraints
//    -----------
//
//            1 <= N <= 10^5
//            1 <= ListNode.data <= 10^9
//
//
//    S.H.I.E.L.D Guidelines
//    ----------------------
//
//            - Rearrange existing nodes only.
//            - Do not create copies of nodes.
//            - Avoid using extra storage or auxiliary data structures.
//            - Preserve the relative order of nodes selected in every round.

public class AvengersAssembleLinkedListMission {

    public ListNode createLinkedList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode ansDummy = new ListNode();
        ListNode ans = ansDummy;

        ListNode curr = head;
        while(curr != null) {
            int count = 0;
            ListNode oddDummy = new ListNode();
            ListNode odd = oddDummy;

            while(curr != null) {
                ListNode next = curr.next;
                curr.next = null;

                if ((count & 1) == 0) {
                    ans.next = curr;
                    ans = curr;
                } else {
                    odd.next = curr;
                    odd = curr;
                }

                count++;
                curr = next;
            }

            curr = oddDummy.next;
        }

        return ansDummy.next;
    }

    public static ListNode solve(ListNode head) {

        List<ListNode> nodes = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }

        List<ListNode> order = new ArrayList<>();

        List<ListNode> remaining = nodes;

        while (!remaining.isEmpty()) {

            List<ListNode> next = new ArrayList<>();

            for (int i = 0; i < remaining.size(); i++) {

                if ((i & 1) == 0) {
                    order.add(remaining.get(i));
                } else {
                    next.add(remaining.get(i));
                }
            }

            remaining = next;
        }

        for (int i = 0; i < order.size() - 1; i++) {
            order.get(i).next = order.get(i + 1);
        }

        order.getLast().next = null;

        return order.getFirst();
    }
}