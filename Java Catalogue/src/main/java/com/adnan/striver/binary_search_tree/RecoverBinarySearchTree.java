package com.adnan.striver.binary_search_tree;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 99: MEDIUM
// https://leetcode.com/problems/recover-binary-search-tree/

// Approach 1 (Iterative): Morris Inorder Traversal.
// Approach 2 (Recursive): Recursive inorder traversal
// Approach 3 (Iterative): Stack Inorder traversal.

// Core Idea: If, we have the sorted numbers from inorder traversal we can check which 2 values
// are not in ascending order. When we first encounter this we need to save both first and
// second and as we progress ahead we only need to update second. It is possible that we may
// only first only 1 pair which is not in order. But that's okay, so lastly we swap the node values.

public class RecoverBinarySearchTree {

    TreeNode prev;
    TreeNode first;
    TreeNode second;

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public void recoverTree(TreeNode root) {
        first = null;
        second = null;
        prev = null;

        TreeNode curr = root;
        while(curr != null) {
            if(curr.left == null) {
                update(curr);
                curr = curr.right;
            } else {
                TreeNode next = curr.left;
                while(next.right != null && next.right != curr) {
                    next = next.right;
                }

                if(next.right == null) {
                    next.right = curr;
                    curr = curr.left;
                } else {
                    next.right = null;
                    update(curr);
                    curr = curr.right;
                }
            }
        }

        if(first != null && second != null) {
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    private void update(TreeNode curr) {
        if(prev != null && prev.val >= curr.val) {
            if(first == null)
                first = prev;
            second = curr;
        }
        prev = curr;
    }

    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(H)
//    public void recoverTree(TreeNode root) {
//        first = null;
//        second = null;
//        prev = null;
//
//        inorder(root);
//
//        if(first != null && second != null) {
//            int temp = first.val;
//            first.val = second.val;
//            second.val = temp;
//        }
//    }
//
//    private void inorder(TreeNode node) {
//        if(node == null) return;
//
//        inorder(node.left);
//        if(prev != null && prev.val > node.val) {
//            if(first == null)
//                first = prev;
//
//            second = node;
//        }
//        prev = node;
//        inorder(node.right);
//    }

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(H)
    // public void recoverTree(TreeNode root) {
    //     if(root == null) return;

    //     Deque<TreeNode> stack = new ArrayDeque<>();

    //     TreeNode first = null;
    //     TreeNode second = null;

    //     TreeNode prev = null;
    //     TreeNode curr = root;
    //     while(curr != null || !stack.isEmpty()) {
    //         while(curr != null) {
    //             stack.push(curr);
    //             curr = curr.left;
    //         }

    //         curr = stack.pop();
    //         if(prev != null && prev.val > curr.val) {
    //             if(first == null) {
    //                 first = prev;
    //                 second = curr;
    //             } else {
    //                 second = curr;
    //             }
    //         }
    //         prev = curr;
    //         curr = curr.right;
    //     }

    //     if(first != null && second != null) {
    //         int temp = first.val;
    //         first.val = second.val;
    //         second.val = temp;
    //     }
    // }
}