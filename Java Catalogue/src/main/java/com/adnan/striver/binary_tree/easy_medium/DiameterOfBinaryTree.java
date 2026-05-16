package com.adnan.striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 543: EASY
// https://leetcode.com/problems/diameter-of-binary-tree/

// Approach: Calculate the depth/height of each subtree and at each step calculate the
// diameter and maintain a maxDiameter.

public class DiameterOfBinaryTree {
    int diameter;

    // Time Complexity: O(N)
    // Space Complexity: O(N) - stack space
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }

    private int height(TreeNode node) {
        if(node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}