package com.adnan.striver.linked_list;

import java.util.ArrayList;
import java.util.List;

public class LinkedListUtils {

    public static int[] toArray(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode curr = head;

        while(curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static ListNode construct(int[] nums) {
        if(nums.length == 0) return null;

        ListNode head = new ListNode(nums[0]);
        ListNode prev = head;
        for(int i = 1; i <= nums.length -1; i++) {

            ListNode curr = new ListNode(nums[i]);
            prev.next = curr;
            prev = curr;
        }

        return head;
    }

    public static ListNode addCycle(ListNode head, int pos) {
        if(pos < 0) return null;

        ListNode tail = getTail(head);
        ListNode el =  getElementAtK(head, pos);
        tail.next = el;

        return el;
    }

    private static ListNode getElementAtK(ListNode head, int pos) {
        ListNode curr = head;
        int counter = 0;
        while(curr != null) {
            if(counter == pos) {
                return curr;
            }

            counter++;
            curr = curr.next;
        }

        return head;
    }

    private static ListNode getTail(ListNode head) {
        ListNode curr = head;

        while(curr.next != null) {
            curr = curr.next;
        }

        return curr;
    }

    public static void print(ListNode head) {
        System.out.println(head);
    }

}