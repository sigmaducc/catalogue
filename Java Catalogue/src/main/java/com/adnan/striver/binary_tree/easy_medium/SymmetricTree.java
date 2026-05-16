package com.adnan.striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

// LeetCode 101: EASY
// https://leetcode.com/problems/symmetric-tree/

// Approach (Recursive): We follow the same principle as same tree but for mirrored nodes.
// We recursively check for root values. if both roots of subtrees are null then
// it means we can continue if either root of subtree is null that mean it is not symmetric
// Lastly we check if both roots have different values if it does then it is not symmetric
// Next we check for left and right subtree with left.left and right.right and left.right and right.left

// Approach (Iterative): We apply the normal BFS algorithm, but we start from left and right node.
// We then poll both left and right. If both are null we can continue and check for other nodes. If
// either of them is null we know it's not symmetric, or if the node values are not same.
// Lastly we add the children back in the queue but the order matters. So we add left.left and right.right
// and then right.left and left.right

// NOTE: We are checking mirrored nodes here. But the same logic applies that of same tree.

public class SymmetricTree {

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);
        while(!q.isEmpty()) {
            TreeNode left = q.poll();
            TreeNode right = q.poll();

            if(left == null && right == null)
                continue;

            if(left == null || right == null)
                return false;

            if(left.val != right.val)
                return false;

            q.offer(left.left);
            q.offer(right.right);

            q.offer(left.right);
            q.offer(right.left);
        }

        return true;
    }


    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(N) - stack space
//    public boolean isSymmetric(TreeNode root) {
//        return check(root.left, root.right);
//    }

    private boolean check(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;

        return check(left.left, right.right) && check(left.right, right.left);
    }
}