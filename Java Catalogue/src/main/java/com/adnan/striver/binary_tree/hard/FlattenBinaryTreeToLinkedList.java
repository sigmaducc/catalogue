package com.adnan.striver.binary_tree.hard;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

// LeetCode 114: MEDIUM
// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

// Approach: We use DFS pre-order traversal, after popping element from stack we modify it's left
// and right children. But before modifying we need to make sure node's children are pushed in the
// stack, right first and then left. Since, it's a stack so order is reversed.

public class FlattenBinaryTreeToLinkedList {

    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public void flatten(TreeNode root) {
        if(root == null) return;

        Deque<TreeNode> s = new ArrayDeque<>();
        s.push(root);
        while(!s.isEmpty()) {
            TreeNode node = s.pop();

            if(node.right != null) s.push(node.right);
            if(node.left != null) s.push(node.left);

            node.left = null;
            node.right = s.peek();
        }
    }
}