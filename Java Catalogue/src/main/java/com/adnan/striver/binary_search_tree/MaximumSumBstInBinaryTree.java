package com.adnan.striver.binary_search_tree;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 1373: HARD
// https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/

// Approach: The trick is to figure out what states each node holds. After, trial and error
// I found that we need to know if child subtrees are BST or not so we have a boolean for
// that. We also need to carry the sum. Then comes the main part of storing the range
// along the way. Starting at the null node our min and max will be (Inf, -Inf). As
// we move up the tree we will recalc our min and max for each node if it is a valid
// BST else we don't care. Min at each node is nothing but the min between current
// node and left subtree max. Similarly, max will be nothing but max between current
// node and right subtree min. Whenever we calculate sum we can store it in global max
// variable.

public class MaximumSumBstInBinaryTree {
    int maxSum;

    // Time Complexity: O(N)
    // Space Complexity: O(H)
    public int maxSumBST(TreeNode root) {
        this.maxSum = 0;
        dfs(root);
        return this.maxSum;
    }

    private NodeState dfs(TreeNode node) {
        if(node == null)
            return new NodeState(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);

        NodeState left = dfs(node.left);
        NodeState right = dfs(node.right);

        if(left.isBst && right.isBst && left.max < node.val && node.val < right.min) {
            int sum = left.sum + right.sum + node.val;
            this.maxSum = Math.max(this.maxSum, sum);
            return new NodeState(Math.min(left.min, node.val), Math.max(right.max, node.val), sum, true);
        }

        return new NodeState(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, false);
    }

    private static class NodeState {
        int max;
        int min;
        int sum;
        boolean isBst;

        public NodeState(int min, int max, int sum, boolean isBst) {
            this.min = min;
            this.max = max;
            this.sum = sum;
            this.isBst = isBst;
        }
    }
}