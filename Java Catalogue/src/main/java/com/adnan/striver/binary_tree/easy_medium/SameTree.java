package com.adnan.striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

// LeetCode 100: EASY
// https://leetcode.com/problems/same-tree/

// Approach(Recursive): Best to use recursive solution. At each step we compare the root of the subtree.
// If both roots are null then its same, if either is null that means its not same tree and
// lastly if both root values are different they are not same. After all these checks it
// means we are good and move on to children in ordered manner meaning node1.left and node2.left and
// node1.right and node2.right

// Approach (Iterative): We apply the normal BFS algorithm, but we start from p and q node.
// We then poll both node1 and node2. If both are null we can continue and check for other nodes. If
// either of them is null we know it's not same, or if the node values are not same.
// Lastly we add the children back in the queue but the order matters. So we add node1.left and node2.left
// and then node1.right and node2.right

public class SameTree {

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode> que = new LinkedList<>();

        que.offer(p);
        que.offer(q);

        while(!que.isEmpty()) {
            TreeNode node1 = que.poll();
            TreeNode node2 = que.poll();

            if(node1 == null && node2 == null)
                continue;

            if(node1 == null || node2 == null)
                return false;

            if(node1.val != node2.val)
                return false;

            que.offer(node1.left);
            que.offer(node2.left);

            que.offer(node1.right);
            que.offer(node2.right);
        }

        return true;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(N) - stack space - worst case skew tree
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        return check(p, q);
//    }

    private boolean check(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;

        return check(p.left, q.left) && check(p.right, q.right);
    }
}