package com.adnan.striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 110: EASY
// https://leetcode.com/problems/balanced-binary-tree/

// Approach: Calculate depth/height of subtrees. If at any point we get the absolute difference
// to be more than 1 that means the tree is not balanced and just propagate the failure state
// to above levels using -1.

public class BalancedBinaryTree {

    // Time Complexity: O(N)
    // Space Complexity: O(N) - stack space
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if(node == null) return 0;

        int left = height(node.left);
        if(left == -1) return -1;
        int right = height(node.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
}