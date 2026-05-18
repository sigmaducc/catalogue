package com.adnan.striver.binary_tree.traversals;

import com.adnan.striver.binary_tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// LeetCode 144: EASY
// https://leetcode.com/problems/binary-tree-preorder-traversal/

// Approach (Iterative): We apply normal DFS algorithm but instead of pushing left
// and right in stack we push right and left because we want ROOT LEFT RIGHT.
// Since, stack reverses the order we have to do RIGHT and LEFT insertion

public class BinaryTreePreorderTraversal {

    // Iterative
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();

            list.add(node.val);
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }

        return list;
    }

    // Recursive
    // Time Complexity: O(N)
    // Space Complexity: O(N) - stack space
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//
//        preorder(root, list);
//
//        return list;
//    }

    private void preorder(TreeNode node, List<Integer> list) {
        if(node == null) return;

        list.add(node.val);
        preorder(node.left, list);
        preorder(node.right, list);
    }
}