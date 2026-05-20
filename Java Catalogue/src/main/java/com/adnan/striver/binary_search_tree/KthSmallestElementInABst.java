package com.adnan.striver.binary_search_tree;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 230: MEDIUM
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/

// Approach 1: Use Morris Inorder Traversal and maintain a counter.
// Approach 2: Use normal inorder traversal and maintain a counter.

public class KthSmallestElementInABst {

    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;

        int count = 0;
        TreeNode curr = root;
        while(curr != null) {
            if(curr.left == null) {
                count++;
                if(count == k)
                    return curr.val;
                curr = curr.right;
            } else {
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if(pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;

                    count++;
                    if(count == k)
                        return curr.val;

                    curr = curr.right;
                }
            }
        }

        return -1;
    }

    // Time Complexity: O(N)
    // Space Complexity: O(H)
    // public int kthSmallest(TreeNode root, int k) {
    //     if(root == null) return 0;

    //     Deque<TreeNode> stack = new ArrayDeque<>();

    //     int count = 0;
    //     TreeNode curr = root;
    //     while(curr != null || !stack.isEmpty()) {
    //         while(curr != null) {
    //             stack.push(curr);
    //             curr = curr.left;
    //         }
    //         curr = stack.pop();
    //         count++;
    //         if(count == k)
    //             return curr.val;
    //         curr = curr.right;
    //     }

    //     return -1;
    // }
}