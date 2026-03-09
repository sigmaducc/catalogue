package com.adnan.striver.linked_list;

// LeetCode 138: MEDIUM
// https://leetcode.com/problems/copy-list-with-random-pointer/

// Approach 1: Create nodes without any links and map it with original
// list nodes. In next iteration simply get the node from map by using
// original list elements. Get for curr, next and random and link.
// In the end return the node mapped to head of original list.

// Approach 2: We know that map will always have same value nodes for key
// and value. Using this intuition we can think of an approach where we
// add fake nodes immediately after the original nodes. And modify the links.
// Meaning originalNode -> fakeNode -> originalNode -> fakeNode.
// So, in first pass we enlarge the list by adding fake nodes with value
// equal to original nodes.
// In second pass we add random links. Meaning if A.random -> B.random
// then it means, A.next.random -> B.next.random, why? because next
// node is fake one. So .next will always work because for every
// original node there is a fake node. Only need to handle null scenario.
// In third pass we finally segregate original and fake nodes by linking
// their next pointers. We start with a dummy node and keep adding fake nodes.

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {

    // Time Complexity: O(n + n + n) ~ O(n)
    // Space Complexity: O(1)
    public Node copyRandomList(Node head) {
        Node curr = head;
        while(curr != null) {
            Node node = new Node(curr.val);
            node.next = curr.next;
            curr.next = node;

            curr = curr.next.next;
        }

        curr = head;
        while(curr != null) {
            if(curr.random != null) {
                curr.next.random = curr.random.next;
            } else {
                curr.next.random = null;
            }

            curr = curr.next.next;
        }

        curr = head;
        Node node = new Node(Integer.MIN_VALUE);
        head = node;
        while(curr != null) {
            node.next = curr.next;
            curr.next = curr.next.next;

            node = node.next;
            curr = curr.next;
        }

        return head.next;
    }

    // Time Complexity: O(n + n) ~ O(n)
    // Space Complexity: O(n)
    // public Node copyRandomList(Node head) {
    //     // head : node
    //     Map<Node, Node> map = new HashMap();
    //     Node curr = head;

    //     while(curr != null) {
    //         map.put(curr, new Node(curr.val));
    //         curr = curr.next;
    //     }

    //     curr = head;
    //     while(curr != null) {
    //         Node self = map.get(curr);
    //         Node next = map.get(curr.next);
    //         Node random = map.get(curr.random);

    //         self.next = next;
    //         self.random = random;

    //         curr = curr.next;
    //     }

    //     return map.get(head);
    // }
}