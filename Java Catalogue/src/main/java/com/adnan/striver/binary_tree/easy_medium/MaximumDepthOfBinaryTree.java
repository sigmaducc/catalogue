package com.adnan.striver.binary_tree.easy_medium;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 104: EASY
// https://leetcode.com/problems/maximum-depth-of-binary-tree/

// Approach (Iterative): Run a simple BFS(level-order) algorithm and count the levels.
// Approach (Recursive): Run a recursive algorithm which counts depth for each root node.

public class MaximumDepthOfBinaryTree {

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        Deque<TreeNode> q = new ArrayDeque<>();

        int depth = 0;
        q.offer(root);
        while(!q.isEmpty()) {
            int width = q.size();

            while(width-- > 0) {
                TreeNode node = q.poll();

                if(node != null && node.left != null)
                    q.offer(node.left);

                if(node != null && node.right != null)
                    q.offer(node.right);
            }

            depth++;
        }

        return depth;
    }

    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(N) stack space
//    public int maxDepth(TreeNode root) {
//        return depth(root);
//    }

    private int depth(TreeNode node) {
        if(node == null) return 0;

        int a = depth(node.left);
        int b = depth(node.right);

        return 1 + Math.max(a, b);
    }
}