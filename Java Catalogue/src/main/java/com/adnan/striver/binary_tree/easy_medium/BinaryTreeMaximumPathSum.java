package com.adnan.striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 124: HARD
// https://leetcode.com/problems/binary-tree-maximum-path-sum/

// Approach: We need to calculate 2 things at each recursion.
// 1. One is max path which we can calculate using left + right + curr
// 2. Other is the longest path which needs to be returned, so we return
// the max of left or right + curr
// We always ignore the negative values hence at each subtree we check if
// the values is negative if it is we turn it to 0;

public class BinaryTreeMaximumPathSum {

    int max;

    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        height(root);
        return max;
    }

    private int height(TreeNode node) {
        if(node == null) return 0;

        int left = Math.max(height(node.left), 0);
        int right = Math.max(height(node.right), 0);

        max = Math.max(max, left + right + node.val);

        return Math.max(left, right) + node.val;
    }
}