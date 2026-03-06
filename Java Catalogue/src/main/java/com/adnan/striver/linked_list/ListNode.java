package com.adnan.striver.linked_list;

import com.adnan.ds.linked_list.singly.Node;

import java.util.StringJoiner;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return this.val + "";
    }

//    @Override
//    public String toString() {
//        StringJoiner sj = new StringJoiner(" -> ");
//
//        ListNode curr = this;
//
//        while (curr != null) {
//            sj.add(String.valueOf(curr.val));
//            curr = curr.next;
//        }
//
//        sj.add("null");
//
//        return sj.toString();
//    }
}