package com.adnan.striver.binary_search_tree;

import com.adnan.striver.binary_tree.TreeNode;

// LeetCode 701: MEDIUM
// https://leetcode.com/problems/insert-into-a-binary-search-tree/

// Approach: We try to store the node which could become the parent of the new node.
// We do that by traversing the array either left or right and once we reach null
// that means the parent/prev was the node which needs to hold the new child node.

public class InsertIntoABinarySearchTree {

    // Time Complexity: O(N)
    // Average: O(log N)
    // Worst: O(n) - degenerate tree
    // Space Complexity: O(1)
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);

        TreeNode prev = root;
        TreeNode curr = val < root.val ? root.left : root.right;

        while(curr != null) {
            prev = curr;

            if(val < curr.val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        if(val < prev.val)
            prev.left = new TreeNode(val);
        else
            prev.right = new TreeNode(val);

        return root;
    }
}