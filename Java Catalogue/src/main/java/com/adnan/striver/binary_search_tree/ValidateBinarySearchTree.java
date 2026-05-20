package com.adnan.striver.binary_search_tree;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 98: MEDIUM
// https://leetcode.com/problems/validate-binary-search-tree/

// Approach (Iterative): We do the inorder traversal of BST and since inorder traversal is always
// sorted that means we indirectly validate the BST. We only need to track prev and curr node. When
// prev node becomes greater than curr node we exit.

// Approach (Recursive): We maintain bounds for each node. Starting at (-Inf, +Inf) at root when moving
// left our max for left subtree should be the root node. Similarly, for the right subtree the min is
// root node. If at any point we find a node out of bounds of this range we know the tree is not BST.

public class ValidateBinarySearchTree {

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        Deque<TreeNode> stack = new ArrayDeque<>();

        Long prev = null;
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()) {
            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            if(prev != null && prev >= curr.val)
                return false;

            prev = (long) curr.val;
            curr = curr.right;
        }

        return true;
    }

    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(H) - stack space
//    public boolean isValidBST(TreeNode root) {
//        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
//    }

    private boolean dfs(TreeNode node, long min, long max) {
        if(node == null) return true;
        if(node.val >= max || node.val <= min) return false;

        return dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
    }
}