package com.adnan.striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 226: EASY
// https://leetcode.com/problems/invert-binary-tree/

// Approach (Iterative): We use BFS algorithm and at each node we swap their children.
// Approach (Recursive): We swap their children and move on to the children nodes. At
// any point if we encounter null nodes we stop that branch.

public class InvertBinaryTree {

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if(node.left != null) q.offer(node.left);
            if(node.right != null) q.offer(node.right);
        }

        return root;
    }


    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(N) - stack space
    // public TreeNode invertTree(TreeNode root) {
    //     if(root == null) return null;

    //     TreeNode temp = root.left;
    //     root.left = root.right;
    //     root.right = temp;

    //     invertTree(root.left);
    //     invertTree(root.right);

    //     return root;
    // }
}